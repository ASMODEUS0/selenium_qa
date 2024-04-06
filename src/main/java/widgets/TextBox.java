package widgets;

import org.openqa.selenium.WebElement;

public class TextBox {
    WebElement textBox;

    public TextBox(WebElement textBox) {
        this.textBox = textBox;
    }



    public void enterWord(String word){
        textBox.sendKeys(word);
    }
}
