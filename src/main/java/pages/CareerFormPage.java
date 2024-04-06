package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class CareerFormPage {


    private final WebDriver browser;


    public CareerFormPage(WebDriver browser) {
        this.browser = browser;
    }


    public String getFormName(){
        return browser.findElement(Locators.CareerFormPage.FORM_NAME).getText();
    }
}
