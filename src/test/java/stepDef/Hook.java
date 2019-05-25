package stepDef;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;
    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void setup(){
        String chromedriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriverLocation);
        base.driver = new ChromeDriver();
    }

    @After
    public void cleanup() throws InterruptedException {
        Thread.sleep(5000);
        base.driver.quit();
    }

}

