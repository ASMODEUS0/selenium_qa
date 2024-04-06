package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import widgets.Button;

import java.util.function.Function;
import java.util.function.Supplier;

public class ProductPage {

    private final WebDriver browser;
    private final Button addToBasketButton;
    private final Button basketButton;


    public ProductPage(WebDriver browser) {
        this.browser = browser;
        addToBasketButton = new Button(browser.findElement(Locators.ProductPage.ADD_TO_BASKET_BUTTON));
        basketButton = new Button(browser.findElement(Locators.ProductPage.BUSKET_BUTTON));
    }


    public String getProductName() {
        WebElement element = browser.findElement(Locators.ProductPage.FOOD_TITLE_OBJECT);
        return element.getText();
    }

    public void clickAddToBasketButton() {
        addToBasketButton.click();
    }

    public BasketPage clickBasketButton() {
        basketButton.click();
        return new BasketPage();
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public class BasketPage {

        private final Integer timeout = 10000;

        public String getFirstBasketObjectName() {
            return ProductPage.this.browser.findElement(Locators.BasketPage.BASKET_FIRST_ELEMENT).getText();
        }

        public String getCountOfGoodsInBasket() {

            return waitToLoadRequest(() -> ProductPage.this.browser.findElement(Locators.BasketPage.BASKET_GOODS_COUNT).getText(),
                    "");
        }


        private <T> T waitToLoadRequest(Supplier<T> expression, T nullValue) {
            int timeoutCount = 0;
            while (timeoutCount < timeout) {
                try{
                    T result = expression.get();
                    if (result != nullValue) {
                        return result;
                    }
                    Thread.sleep(500);
                    timeoutCount += 500;


                } catch (Exception e) {
                }

            }
            throw new IllegalArgumentException("");
        }

        private Boolean isLoaded() {
            try {
                if (browser.findElement(Locators.BasketPage.MAIN_ELEMENT) == null) {
                    return false;
                }
            } catch (NoSuchElementException e) {
                return false;
            }

            return true;
        }


    }
}
