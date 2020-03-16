$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ViewFunctionality.feature");
formatter.feature({
  "name": "Verify view functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigate to My Store web page",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.AuthenticationFunctionalitySteps.the_user_navigate_to_My_Store_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks sign in button",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.AuthenticationFunctionalitySteps.the_user_clicks_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user inputs email \"David.Fox007@gmail.com\" and password \"111000\"",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinitions.AuthenticationFunctionalitySteps.the_user_inputs_email_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate view functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user click on women",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.ViewFunctionSteps.the_user_click_on_women()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user change the view to list",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.ViewFunctionSteps.the_user_change_the_view_to_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user validate if it has changed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.ViewFunctionSteps.the_user_validate_if_it_has_changed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertTrue(Assert.java:53)\n\tat StepDefinitions.ViewFunctionSteps.the_user_validate_if_it_has_changed(ViewFunctionSteps.java:24)\n\tat ✽.the user validate if it has changed(file:///Users/Khulan/Downloads/Online-Store%202/src/test/resources/ViewFunctionality.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});