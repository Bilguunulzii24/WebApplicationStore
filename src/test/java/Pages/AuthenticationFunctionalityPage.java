package Pages;

import Utils.BrowserUtils;
import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;
import java.util.Set;

public class AuthenticationFunctionalityPage {
    public AuthenticationFunctionalityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement createEmailAddressBox;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createAnAccountButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameBox;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameBox;

    @FindBy(id = "passwd")
    public WebElement createPasswordBox;

    @FindBy(id = "address1")
    public WebElement addressBox;

    @FindBy(id = "city")
    public WebElement cityBox;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement selectState;

    @FindBy(id = "postcode")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//select[@id='id_country']")
    public WebElement selectCountry;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneBox;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement signOut;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressBox;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement signInButton;

    public void sendPersonInfoValue(Map<String, String> personInfo, WebElement webElement, String key1) {
        Set<String> keys = personInfo.keySet();
        for (String key : keys) {
            if (key.equals(key1)) {
                webElement.sendKeys(personInfo.get(key));
            }
        }
    }

    public void selectPersonInfoValue(Map<String, String> personInfo, WebElement webElement, String key1) {
        Set<String> keys = personInfo.keySet();
        for (String key : keys) {
            if (key.equals(key1)) {
                BrowserUtils.selectByVisibleText(webElement, personInfo.get(key));
            }
        }
    }

    @FindBy(xpath = "//div[@id='center_column']/div[@class='alert alert-danger']/p")
    public WebElement errorMessage;
}
