package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    //Other reusable methods go in here:

}
