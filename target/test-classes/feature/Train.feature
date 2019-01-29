#Author: your.email@your.domain.com

@NationalTrain
Feature: Searching for tain details

  @Train
  Scenario: Select train by depature time
  Given The user is in home page
  And User navigating to train b/w station
  When User entering from, to and searching
  Then Verify the correct train is visiable
    

 