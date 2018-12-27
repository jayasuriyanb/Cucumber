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
      | menu        | product     | type   |
      | Electronics | Mobiles     |        |
      | Men         | Clothing | ADIDAS |
