#Author: your.email@your.domain.com
@tag
Feature: Validation of Add Customer Form

  @alert
  Scenario: To check without enter data
    Given the user is in guru99 home page
    And user navigate to Add Customer
    When user clicking sumbit button without data
    Then Verify it show's an alert

  @message
  Scenario Outline: To check weather the entered value is valid or invalid
    Given the user is in guru99 home page
    And user navigate to Add Customer
    When if user enter invalid data "<firstname>","<lastname>","<email>","<address>","<phonenumber>"
    Then the user should see the message

  @reset
  Scenario Outline: The user click reset button
    Given the user is in guru99 home page
    And user navigate to Add Customer
    When user enter the data in form "<firstname>","<lastname>","<email>","<address>","<phonenumber>"
    And the user click reset button
    Then To check All the data removed

    Examples: 
      | firstname | lastname | email      | address | phonenumber |
      |    123456 |    58964 | sft9@gmail | perng@% | qwert       |
      | af123     | rt879yu  | @gmail.com | $@%     | 123rty678   |
