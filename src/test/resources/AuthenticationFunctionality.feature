Feature: Authentication Functionality

  Background:
    Given  the user navigate to My Store web page
    Then the user clicks sign in button

  Scenario: Creating an account
    * the user enters valid email address "David.Fox101@gmail.com"
    * the user click Create an account button
    * the user enters personal information
      | firstName   | David            |
      | lastName    | Fox              |
      | password    | 111000           |
      | address     | 1010 Addison Ave |
      | city        | Chicago          |
      | state       | Illinois         |
      | zipCode     | 60111            |
      | country     | United States    |
      | mobilePhone | 2223334455       |
    * the user clicks Register button
    * the user clicks sign out button
    * the user inputs email "David.Fox101@gmail.com" and password "111000"
    * the user validate title "My account - My Store"
    * the user clicks sign out button

  Scenario: Sign in (positive)
    * the user inputs email "David.Fox101@gmail.com" and password "111000"
    * the user validate title "My account - My Store"
    * the user clicks sign out button

  Scenario: Sign in (negative)
    * the user inputs email "David.Fo@gmail.com" and password "1110"
    * the user validate error message "There is 1 error"
