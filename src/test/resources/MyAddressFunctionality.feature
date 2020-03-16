Feature: Update My Address

  Background:
    * the user navigate to My Store web page
    * the user clicks sign in button
    * the user inputs email "David.Fox007@gmail.com" and password "111000"

  Scenario: Validation of My Address Functionality
    * the user clicks My Addresses Button
    * the user clicks update button
    * the user inputs new address
      | address | 2222 Addison Ave |
      | city    | Miami            |
      | state   | Florida          |
      | zipCode | 90543            |
      | country | United States    |
    * the user clicks Save button
    * the user validates address
      | address | 2222 Addison Ave |
      | city    | Miami            |
      | state   | Florida          |
      | zipCode | 90543            |
      | country | United States    |

