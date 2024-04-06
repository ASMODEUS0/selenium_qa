package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import widgets.Button;
import widgets.TextBox;


public class MainPage {

    private final WebDriver browser;

    private final Button buyButton;
    private final Button subMenuButton;
    private final Button deletRegionWordButton;
    private final Button firstRegionInListButton;
    private final Button firstCityInListButton;
    private final Button shopListButton;
    private final Button searchButton;
    private final Button startSearchButton;

    private final Button catalogButton;


    private final TextBox regionTextBox;
    private final TextBox cityTextBox;
    private final TextBox searchTextBox;



    public MainPage(WebDriver browser) {
        this.browser = browser;
        buyButton = new Button(browser.findElement(Locators.MainPage.BUY_BUTTON));
        subMenuButton = new Button(browser.findElement(Locators.MainPage.SUB_MENU));
        deletRegionWordButton = new Button(browser.findElement(Locators.MainPage.DELETE_REGION_WORD_BUTTON));
        firstRegionInListButton = new Button(browser.findElement(Locators.MainPage.FIRST_REGION_IN_LIST_BUTTON));
        firstCityInListButton = new Button(browser.findElement(Locators.MainPage.FIRST_CITY_IN_LIST_BUTTON));
        shopListButton = new Button(browser.findElement(Locators.MainPage.SHOP_LIST_BUTTON));
        searchButton = new Button(browser.findElement(Locators.MainPage.SEARCH_BUTTON));
        startSearchButton = new Button(browser.findElement(Locators.MainPage.START_SEARCH_BUTTON));

        catalogButton = new Button(browser.findElement(Locators.MainPage.CATALOG_BUTTON));

        regionTextBox = new TextBox(browser.findElement(Locators.MainPage.REGION_TEXT_BOX));
        cityTextBox = new TextBox(browser.findElement(Locators.MainPage.CITY_TEXT_BOX));
        searchTextBox = new TextBox(browser.findElement(Locators.MainPage.SEARCH_TEXT_BOX));
    }

    public ProductPage clickBuyButton() {
        buyButton.click();
        return new ProductPage(browser);
    }

    public SubMenu clickSubMenuButton() {
        subMenuButton.click();
        return new SubMenu();
    }

    public void enterWordToRegionTextBox(String word) {
        regionTextBox.enterWord(word);
    }


    public void enterWordToCityTextBox(String word) {
        cityTextBox.enterWord(word);
    }

    public void clickFirstRegionInListButton() {
        firstRegionInListButton.click();
    }
    public void clickFirstCityInListButton(){
        firstCityInListButton.click();
    }

    public void clickDeleteRegionWordButton() {
        deletRegionWordButton.click();
    }

    public void clikcShopListButton(){
        shopListButton.click();
    }

    public String getFirstShopName(){
       return browser.findElement(Locators.MainPage.FIRST_SHOP_NAME_BLOCK).getText();
    }

    public void clickSearchButton(){
        searchButton.click();
    }
    public void enterWordToSearchTextBox(String word){
        searchTextBox.enterWord(word);
    }
    public void clickStartSearchButton() {
        startSearchButton.click();
    }



    public String getNameOfFirstProductInProductList(){
       return browser.findElement(Locators.MainPage.NAME_OF_FIRST_PRODUCT_IN_PRODUCT_LIST).getText();
    }

    public CatalogPage clickGoodsCatalogButton(){
        catalogButton.click();
        return new CatalogPage(browser);
    }



    public class SubMenu {
        public final Button careerButton;

        public SubMenu() {
            careerButton = new Button(browser.findElement(Locators.SubMenu.CAREER_BUTTON));
        }

        public CareerMenuPage clickCareerButton() {
            careerButton.click();
            return new CareerMenuPage(browser);
        }


    }

//    public JavaPage clickJavaButton() {
//        javaButton.click();
//        return new JavaPage(browser);
//    }
}
