#Author: your.email@your.domain.com
@card
Feature: Credit Card Validation

  @credit
  Scenario Outline: Checking credit card balance
    Given User is in guru payment project home page
    And User clicking chechk credit card limit
    When user entering credit card number "<cardnumber>"
    And the user clciking submit button
    Then user checks the credit balance
Examples: 
      | cardnumber       | expmonth | expyear | cvvcode |
      | 4908951101630852 |       04 |    2023 |     146 |
  @buy
  Scenario Outline: Checking credit card balance
    Given User is in guru payment project home page
    And User selecting the quantity and clicking BuyNow
    When user entering card details "<cardnumber>","<expmonth>","<expyear>","<cvvcode>"
    And User clicking pay button
    Then check the payment done successfully
Examples: 
      | cardnumber       | expmonth | expyear | cvvcode |
      | 4908951101630852 |       04 |    2023 |     146 |
  @gcd
  Scenario Outline: Generate card details
    Given User is in guru payment project home page
    And user clicking generate card details
    When user taking card details from new window
    Then passing the details to cart

    Examples: 
      | cardnumber       | expmonth | expyear | cvvcode |
      | 4908951101630852 |       04 |    2023 |     146 |
