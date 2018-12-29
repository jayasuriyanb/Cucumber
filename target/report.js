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
  "name": "flipkart using arguments",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "user is in flipkart home page",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate through arguments \"\u003cmenu\u003e\",\"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "navigate through arguments \"\u003cmenu\u003e\",\"\u003cproduct\u003e\",\"\u003ctype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify user in selected product",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "menu",
        "product",
        "type"
      ]
    },
    {
      "cells": [
        "Electronics",
        "Mobiles",
        ""
      ]
    },
    {
      "cells": [
        "Men",
        "Clothing",
        "ADIDAS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "flipkart using arguments",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@shop"
    },
    {
      "name": "@tag2"
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
  "name": "navigate through arguments \"Electronics\",\"Mobiles\"",
  "keyword": "When "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.navigate_through_arguments(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate through arguments \"Electronics\",\"Mobiles\",\"\"",
  "keyword": "And "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.navigate_through_arguments(String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 6.2.9200 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SONY\u0027, ip: \u0027192.168.43.142\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\user\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55793}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: f69baffa5cd09e22147f38af8ab07e56\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat org.test.mv.cuc.Cucum.Flipkart_ArgumentPassing.navigate_through_arguments(Flipkart_ArgumentPassing.java:48)\r\n\tat ✽.navigate through arguments \"Electronics\",\"Mobiles\",\"\"(src/test/java/feature/Flipkart_Arguments.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify user in selected product",
  "keyword": "Then "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.verify_user_in_selected_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "flipkart using arguments",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@shop"
    },
    {
      "name": "@tag2"
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
  "name": "navigate through arguments \"Men\",\"Clothing\"",
  "keyword": "When "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.navigate_through_arguments(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate through arguments \"Men\",\"Clothing\",\"ADIDAS\"",
  "keyword": "And "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.navigate_through_arguments(String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"l\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 6.2.9200 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SONY\u0027, ip: \u0027192.168.43.142\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\user\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55911}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 8bf5c07e6e9ecb25445de3e2b294e10d\n*** Element info: {Using\u003dxpath, value\u003dl}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.test.mv.cuc.Cucum.Flipkart_ArgumentPassing.navigate_through_arguments(Flipkart_ArgumentPassing.java:52)\r\n\tat ✽.navigate through arguments \"Men\",\"Clothing\",\"ADIDAS\"(src/test/java/feature/Flipkart_Arguments.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify user in selected product",
  "keyword": "Then "
});
formatter.match({
  "location": "Flipkart_ArgumentPassing.verify_user_in_selected_product()"
});
formatter.result({
  "status": "skipped"
});
});