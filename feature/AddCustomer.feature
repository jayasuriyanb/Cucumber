#Author: your.email@your.domain.com
Feature: To add new customer

  Scenario: Fill the regirster form and verify customer ID
    Given user is in guru telecom user page
    And the customer navigate to add customer
    When fill the registeration form
      | background | done        |
      | fisrtname  | abcd        |
      | lastname   | eft         |
      | email1     | we@gmai.com |
      | address1   | ldeoo9884   |
      | phnum1     |  1234567890 |
    And Submit the form
    Then Verify the customer ID
