package StepDefinitions;

import Pages.AuthenticationFunctionalityPage;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.Map;

public class AuthenticationFunctionalitySteps {
    AuthenticationFunctionalityPage page = new AuthenticationFunctionalityPage();
    WebDriver driver = Driver.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("the user navigate to My Store web page")
    public void the_user_navigate_to_My_Store_web_page() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @Then("the user clicks sign in button")
    public void the_user_clicks_sign_in_button() {
        page.signIn.click();
    }

    @Then("the user enters valid email address {string}")
    public void the_user_enters_valid_email_address(String email) {
        page.createEmailAddressBox.sendKeys(email);
    }

    @Then("the user click Create an account button")
    public void the_user_click_Create_an_account_button() {
        page.createAnAccountButton.click();
    }

    @Then("the user enters personal information")
    public void the_user_enters_personal_information(Map<String, String> personInfo) {
        page.sendPersonInfoValue(personInfo, page.firstNameBox, "firstName");
        page.sendPersonInfoValue(personInfo, page.lastNameBox, "lastName");
        page.sendPersonInfoValue(personInfo, page.createPasswordBox, "password");
        page.sendPersonInfoValue(personInfo, page.addressBox, "address");
        page.sendPersonInfoValue(personInfo, page.cityBox, "city");
        page.selectPersonInfoValue(personInfo, page.selectState, "state");
        page.sendPersonInfoValue(personInfo, page.zipCodeBox, "zipCode");
        page.sendPersonInfoValue(personInfo, page.mobilePhoneBox, "mobilePhone");
        page.selectPersonInfoValue(personInfo, page.selectCountry, "country");
    }

    @Then("the user clicks Register button")
    public void the_user_clicks_Register_button() {
        page.registerButton.click();
    }

    @Then("the user clicks sign out button")
    public void the_user_clicks_sign_out_button() {
        page.signOut.click();
    }

    @Then("the user inputs email {string} and password {string}")
    public void the_user_inputs_email_and_password(String email, String password) {
        page.emailAddressBox.sendKeys(email);
        page.passwordBox.sendKeys(password);
        js.executeScript("arguments[0].scrollIntoView(true)", page.signInButton);
        page.signInButton.click();
    }

    @Then("the user validate title {string}")
    public void the_user_validate_title(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Then("the user validate error message {string}")
    public void the_user_validate_error_message(String expectedErrorMessage) {
        String actualErrorMessage = page.errorMessage.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }


}
