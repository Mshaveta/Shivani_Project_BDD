package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private WebDriver driver;

    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}
