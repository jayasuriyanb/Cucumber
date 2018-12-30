$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Flipkart_Arguments.feature");
formatter.feature({
  "name": "menu navigation using arguments",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@shop"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Flipkart using filters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@filter"
    }
  ]
});
formatter.step({
  "name": "user is in flipkart home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the product \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "using filters user selecting product \"\u003cRAM\u003e\",\"\u003cCUSTOMER RATING\u003e\",\"\u003cSIM\u003e\",\"\u003cMINIMUM\u003e\",\"\u003cMAXIMUM\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify weather the user get the product",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "RAM",
        "CUSTOMER RATING",
        "SIM",
        "MINIMUM",
        "MAXIMUM"
      ]
    },
    {
      "cells": [
        "iphone 7",
        "512",
        "4",
        "Dual",
        "₹16000",
        "₹50000+"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Flipkart using filters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@shop"
    },
    {
      "name": "@filter"
    }
  ]
});
formatter.step({
  "name": "user is in flipkart home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.user_is_in_flipkart_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the product \"iphone 7\"",
  "keyword": "When "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.user_enter_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "using filters user selecting product \"512\",\"4\",\"Dual\",\"₹16000\",\"₹50000+\"",
  "keyword": "And "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.using_filters_user_selecting_product(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify weather the user get the product",
  "keyword": "Then "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.verify_weather_the_user_get_the_product()"
});
formatter.result({
  "status": "passed"
});
});