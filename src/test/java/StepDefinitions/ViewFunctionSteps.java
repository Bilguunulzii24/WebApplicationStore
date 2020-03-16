package StepDefinitions;

import Pages.ViewFunctionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ViewFunctionSteps {

    ViewFunctionPage viewFunctionPage = new ViewFunctionPage();
    @Given("the user click on women")
    public void the_user_click_on_women() {
     viewFunctionPage.womenBtn.click();
    }


    @Then("the user change the view to list")
    public void the_user_change_the_view_to_list() {
      viewFunctionPage.listBtn.click();
    }
    @Then("the user validate if it has changed")
    public void the_user_validate_if_it_has_changed() {

        Assert.assertTrue(viewFunctionPage.actual.getAttribute("class").equals("selected"));

    }
}
