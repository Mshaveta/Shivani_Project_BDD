package pages;


import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.Core;

public class ContactUsPage extends BasePage {



    @FindBy(name="your-name")
    private WebElement yourName;

    @FindBy(xpath="//div[@class='flag-dropdown']")
    private WebElement countryIcon;

    @Inject
    public ContactUsPage(Core core) {
        super(core);
    }

    public String isContactUsTitleAvailable() {
       return driver.getTitle();
    }

    public void enterName(String name){
        yourName.sendKeys(name);
    }

    public void enterCountry(String countryCode,String country_name){
        countryIcon.click();
        By countryName= By.xpath("//li[@data-country-code='"+countryCode+"']/span[contains(text(),'"+country_name+"')]");
        driver.findElement(countryName).click();
    }
}
