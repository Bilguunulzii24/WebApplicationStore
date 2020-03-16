Feature: Verify view functionalities
  Background:
    * the user navigate to My Store web page
    * the user clicks sign in button
    * the user inputs email "David.Fox007@gmail.com" and password "111000"

  Scenario: Validate view functionality
    Given the user click on women
    Then the user change the view to list
    And the user validate if it has changed