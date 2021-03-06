#Author: your.email@your.domain.com
@shop
Feature: menu navigation using arguments

  @tag2
  Scenario Outline: flipkart using arguments
    Given user is in flipkart home page
    When navigate through arguments "<menu>","<product>"
    And navigate through arguments "<menu>","<product>","<type>"
    Then verify user in selected product

    Examples: 
      | menu        | product  | type   |
      | Electronics | Mobiles  |        |
      | Men         | Clothing | ADIDAS |

  @filter @tag2
  Scenario Outline: Flipkart using filters
    Given user is in flipkart home page
    When user enter the product "<product>"
    And using filters user selecting product "<RAM>","<CUSTOMER RATING>","<SIM>","<MINIMUM>","<MAXIMUM>"
    Then verify weather the user get the product

    Examples: 
      | product  | RAM | CUSTOMER RATING | SIM  | MINIMUM | MAXIMUM |
      | iphone 7 | 512 |               4 | Dual | ₹16000  | ₹50000+ |
