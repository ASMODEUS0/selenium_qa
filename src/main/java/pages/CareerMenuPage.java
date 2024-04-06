package pages;

import org.openqa.selenium.WebDriver;
import utils.Locators;
import widgets.Button;

import java.util.Set;

public class CareerMenuPage {

    private  WebDriver browser;
    private final Button sendRequestButton;

    public CareerMenuPage(WebDriver browser) {
        this.browser = browser;
        this.sendRequestButton = new Button(browser.findElement(Locators.CareerMenuPage.SEND_REQUEST_BUTTON));
    }



    public CareerFormPage clickSendRequestButton() {
        Set<String> windowHandles = browser.getWindowHandles();
        sendRequestButton.click();
        Set<String> changedWindowHandlers = browser.getWindowHandles();
        changedWindowHandlers.removeAll(windowHandles);
        if(windowHandles.size() != 1){
            throw new IllegalArgumentException("An unknown window opened");
        }
       browser = browser.switchTo().window(windowHandles.iterator().next());
        return new CareerFormPage(browser);
    }

}
