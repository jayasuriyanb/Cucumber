#Author: your.email@your.domain.com

@tag
Feature: printing the menu in console

  @allmenu
  Scenario: All menu in home page
  Given going to home page of lifetime
  When printing all menu in console
  Then verify all the menu printed
  
  @menudropdown
  Scenario: All dropdown values in home page
  Given going to home page of lifetime
  When printing all drop down value in console
  Then verify all the menu printed