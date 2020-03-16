package StepDefinitions;

import Pages.AuthenticationFunctionalityPage;
import Pages.MyAddressFunctionalityPage;
import io.cucumber.java.en.Given;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class MyAddressFunctionalitySteps {
    MyAddressFunctionalityPage addressPage = new MyAddressFunctionalityPage();
    AuthenticationFunctionalityPage page = new AuthenticationFunctionalityPage();


    @Given("the user clicks My Addresses Button")
    public void the_user_clicks_My_Addresses_Button() {
        addressPage.AddressButton.click();
    }

    @Given("the user clicks update button")
    public void the_user_clicks_update_button() {
        addressPage.updateAddressButton.click();
    }

    @Given("the user inputs new address")
    public void the_user_inputs_new_address(Map<String, String> personInfo) {
        page.addressBox.clear();
        page.sendPersonInfoValue(personInfo, page.addressBox, "address");
        page.cityBox.clear();
        page.sendPersonInfoValue(personInfo, page.cityBox, "city");
        page.selectPersonInfoValue(personInfo, page.selectState, "state");
        page.zipCodeBox.clear();
        page.sendPersonInfoValue(personInfo, page.zipCodeBox, "zipCode");
        page.selectPersonInfoValue(personInfo, page.selectCountry, "country");
    }

    @Given("the user clicks Save button")
    public void the_user_clicks_Save_button() {
        addressPage.saveAddressButton.click();
    }

    @Given("the user validates address")
    public void the_user_validates_address(Map<String, String> addressInfo) {
        Set<String> keys = addressInfo.keySet();
        String expectedAddress = addressPage.addressText.getText().trim();
        String expectedCity = addressPage.cityText.getText().replace(",", "").trim();
        String expectedState = addressPage.stateText.getText().trim();
        String expectedZipCode = addressPage.zipCodeText.getText().trim();
        String expectedCountry = addressPage.countryText.getText().trim();

        List<String> values = new ArrayList<>();
        for (String key : keys) {
            values.add(addressInfo.get(key));
        }
        assertTrue(values.contains(expectedAddress));
        assertTrue(values.contains(expectedCity));
        assertTrue(values.contains(expectedState));
        assertTrue(values.contains(expectedZipCode));
        assertTrue(values.contains(expectedCountry));
    }
}

