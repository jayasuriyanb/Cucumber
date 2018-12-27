
@shopping
Feature: Flipkart shopping site
	
  @mobile
  Scenario Outline: Add the product to cart
    Given the user is in flipkart home page
    When user navigate to electroic->mobile menu
    And selecting the product and add to cart "<mob>"
    Then verift the cart weather the product is availabe

    Examples: 
      | mob |
      |  10 |

  @randomproduct
  Scenario: Add the random product to cart
    Given the user is in flipkart home page
    When user navigate to electroic->mobile menu
    And selecting random product and add to card
    Then verift the cart weather the product is availabe

