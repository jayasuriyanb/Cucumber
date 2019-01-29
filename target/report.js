$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/Train.feature");
formatter.feature({
  "name": "Searching for tain details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NationalTrain"
    }
  ]
});
formatter.scenario({
  "name": "Select train by depature time",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NationalTrain"
    },
    {
      "name": "@Train"
    }
  ]
});
formatter.step({
  "name": "The user is in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TrainEnquiry.the_user_is_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigating to train b/w station",
  "keyword": "And "
});
formatter.match({
  "location": "TrainEnquiry.user_navigating_to_train_b_w_station()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entering from, to and searching",
  "keyword": "When "
});
formatter.match({
  "location": "TrainEnquiry.user_entering_from_to_and_searching()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the correct train is visiable",
  "keyword": "Then "
});
formatter.match({
  "location": "TrainEnquiry.verify_the_correct_train_is_visiable()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"span[class\u003dtrnInputLabel]\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 6.2.9200 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SONY\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\user\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:59543}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: edef2db22032d1c69d157431de9c8def\n*** Element info: {Using\u003dxpath, value\u003dspan[class\u003dtrnInputLabel]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.test.mv.cuc.Cucum.TrainEnquiry.verify_the_correct_train_is_visiable(TrainEnquiry.java:62)\r\n\tat ✽.Verify the correct train is visiable(src/test/java/feature/Train.feature:11)\r\n",
  "status": "failed"
});
});