package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasePage;
import pages.ContactUsPage;
import pages.HomePage;
import javax.inject.Inject;
import static support.FileUtilities.readProperty;

public class ContactUsSteps {
    @Inject
    ContactUsPage contactUsPage;

    @Inject
    BasePage basePage;

    @Inject
    HomePage homePage;

    String PROPERTY_FILE_NAME= "config";

    @Given("The user launches the application")
    public void theUserLaunchesTheApplication(){
        String appURL= readProperty(PROPERTY_FILE_NAME,"app_url");
        basePage.launchWebApplication(appURL);
    }

    @When("The user click on Contact Us link")
    public void the_user_click_on_link( ) {
        homePage.clickOnContactUsLink();
    }

    @Then("The user should be redirected to the contact us Page")
    public void userNavigatesToContactusPage(){
        String expectedTitle = readProperty("contactus", "contactUsPageTitle");
        String actualTitle = contactUsPage.isContactUsTitleAvailable();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("The user enters the name")
    public void userEnterName(){
        String your_name = readProperty("contactus", "yourName");
        contactUsPage.enterName(your_name);
    }

    @And("The user enters the country")
    public void userEnterTheCountry(){
        String countryName = readProperty("contactus", "countryName");
        String countryCode = readProperty("contactus", "countryCode");
        contactUsPage.enterCountry(countryCode,countryName);
    }

}
