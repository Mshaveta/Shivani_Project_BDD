package support;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class Core {
    private Browser browser;

    public Core(){
        getWebDriver();
    }
    public void setUp() {
        browser = new Browser();
        browser.startBrowser();
    }

    public WebDriver getWebDriver(){
        if(browser==null){
            return null;
        }
        return browser.getWebDriver();
    }

    public void quitBrowser(){
        browser.closeBrowser();
    }


}
