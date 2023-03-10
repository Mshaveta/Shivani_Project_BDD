package pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import support.Core;


public class BasePage {

    protected WebDriver driver;

    @Inject
    public BasePage(Core core){
        this.driver = core.getWebDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void launchWebApplication(String app_url){
        this.driver.get(app_url);
    }
}
