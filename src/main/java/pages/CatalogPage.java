package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import widgets.Button;

public class CatalogPage {
    private final WebDriver browser;

    private final Button filterMenuButton;
    private final Button coffeeTeaFilterButton;
    public CatalogPage(WebDriver browser) {
        this.browser = browser;
        filterMenuButton = new Button(browser.findElement(Locators.FilterPage.FILTER_MENU_BUTTON));
        coffeeTeaFilterButton = new Button(browser.findElement(Locators.FilterPage.COFFEE_TEA_FILTER_BUTTON));
    }

    public void clickFilterMenuButton(){
        filterMenuButton.click();
    }

    public void clickCoffeeTeaFilterButton(){
        coffeeTeaFilterButton.click();
    }

    public String getFirstProductInFilterList(){
        return browser.findElement(Locators.FilterPage.NAME_OF_FIRST_PRODUCT_IN_FILTER_LIST).getText();
    }

}
