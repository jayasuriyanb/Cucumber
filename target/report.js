$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/selenium/Cucum/feature/AddCustomer_Verification.feature");
formatter.feature({
  "name": "Validation of Add Customer Form",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The user click reset button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reset"
    }
  ]
});
formatter.step({
  "name": "the user is in guru99 home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigate to Add Customer",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the data in form \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cemail\u003e\",\"\u003caddress\u003e\",\"\u003cphonenumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "And "
});
formatter.step({
  "name": "To check All the data removed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "address",
        "phonenumber"
      ]
    },
    {
      "cells": [
        "123456",
        "58964",
        "sft9@gmail",
        "perng@%",
        "qwert"
      ]
    },
    {
      "cells": [
        "af123",
        "rt879yu",
        "@gmail.com",
        "$@%",
        "123rty678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user click reset button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@reset"
    }
  ]
});
formatter.step({
  "name": "the user is in guru99 home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer_Verification.the_user_is_in_guru_home_page(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to Add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer_Verification.user_navigate_to_Add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the data in form \"123456\",\"58964\",\"sft9@gmail\",\"perng@%\",\"qwert\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer_Verification.user_enter_the_data_in_form(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer_Verification.the_user_click_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check All the data removed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer_Verification.to_check_All_the_data_removed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user click reset button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@reset"
    }
  ]
});
formatter.step({
  "name": "the user is in guru99 home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer_Verification.the_user_is_in_guru_home_page(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to Add Customer",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer_Verification.user_navigate_to_Add_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the data in form \"af123\",\"rt879yu\",\"@gmail.com\",\"$@%\",\"123rty678\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer_Verification.user_enter_the_data_in_form(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer_Verification.the_user_click_reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check All the data removed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer_Verification.to_check_All_the_data_removed()"
});
formatter.result({
  "status": "passed"
});
});