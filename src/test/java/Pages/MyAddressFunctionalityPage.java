package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAddressFunctionalityPage {
    public MyAddressFunctionalityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Addresses']")
    public WebElement AddressButton;

    @FindBy(xpath = "//span[.='Update']")
    public WebElement updateAddressButton;

    @FindBy(id = "submitAddress")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//span[@class='address_address1']")
    public WebElement addressText;

    @FindBy(xpath = "//span[@class='address_address1']/..//following-sibling::li[1]//span[1]")
    public WebElement cityText;

    @FindBy(xpath = "//span[@class='address_address1']/..//following-sibling::li[1]//span[2]")
    public WebElement stateText;

    @FindBy(xpath = "//span[@class='address_address1']/..//following-sibling::li[1]//span[3]")
    public WebElement zipCodeText;

    @FindBy(xpath = "//span[@class='address_address1']/..//following-sibling::li[2]")
    public WebElement countryText;

}
