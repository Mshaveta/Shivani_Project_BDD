package pages;


import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.Core;

public class HomePage extends BasePage{

    @FindBy(xpath="//span[text()='CONTACT US']")
    private WebElement contactUsLink;

    @Inject
    public HomePage(Core core) {
        super(core);
    }

    public void clickOnContactUsLink() {
       contactUsLink.click();
    }

}
