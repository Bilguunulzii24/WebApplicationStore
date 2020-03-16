package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewFunctionPage {

    public ViewFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    public WebElement womenBtn;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    public WebElement listBtn;

    @FindBy(xpath = "//li[@id='list']")
    public WebElement actual;

}
