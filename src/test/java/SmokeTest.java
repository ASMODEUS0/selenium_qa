import org.junit.jupiter.api.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CareerFormPage;
import pages.CareerMenuPage;
import pages.MainPage;
import pages.ProductPage;


//@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class SmokeTest {


    private WebDriver browser;
    private final Cookie STORE_COOKIE = new Cookie("store_id", "1904");



    @BeforeEach
    public void precondition() {
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get("https://dixy.ru/");
    }



    @Test
    public void testAddToBasket() throws InterruptedException {


        MainPage mainPage = new MainPage(browser);

        ProductPage productPage = mainPage.clickBuyButton();
        WebDriver productBrowser = productPage.getBrowser();
        productBrowser.manage().addCookie(STORE_COOKIE);
        productPage.clickAddToBasketButton();
        ProductPage.BasketPage basketPage = productPage.clickBasketButton();
        String countOfGoodsInBasket = basketPage.getCountOfGoodsInBasket();

        Assertions.assertEquals(countOfGoodsInBasket, "Товары (\n" +
                                                      "2\n" +
                                                      ")");

        browser.close();
    }


    @Test
    public void testCareerMenu() throws InterruptedException {


        try{
            MainPage mainPage = new MainPage(browser);

            MainPage.SubMenu subMenu = mainPage.clickSubMenuButton();

            CareerMenuPage careerMenuPage = subMenu.clickCareerButton();

            CareerFormPage careerFormPage = careerMenuPage.clickSendRequestButton();

            String formName = careerFormPage.getFormName();

            String expected = "Стань частью\n" +
                            "большой команды!";
            Assertions.assertEquals(expected.toLowerCase(), formName.toLowerCase());

        }finally {
            browser.close();

        }

    }

    @Test
    public void testToFindShopByEnterRegionAndCity() throws InterruptedException {

        try{
            Thread.sleep(1000);
            MainPage mainPage = new MainPage(browser);
            mainPage.clickDeleteRegionWordButton();
            mainPage.enterWordToRegionTextBox("Москва");
            mainPage.clickFirstRegionInListButton();
            mainPage.enterWordToCityTextBox("Безобразово");
            mainPage.clickFirstCityInListButton();
            mainPage.clikcShopListButton();
            String shopName = mainPage.getFirstShopName();
            String expected = "ш. Калужское, 56-й км, вл. 2, стр. 1";
            Assertions.assertEquals(expected, shopName);
        }finally {
            browser.close();
        }
    }




    //---
}
