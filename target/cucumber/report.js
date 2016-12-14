$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/invoice.feature");
formatter.feature({
  "line": 1,
  "name": "Test invoice preview",
  "description": "",
  "id": "test-invoice-preview",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Triplicate Uniform Invoice",
  "description": "",
  "id": "test-invoice-preview;triplicate-uniform-invoice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open browser and open the application of triplicate uniform invoice",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter the data into the form of triplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 7
    },
    {
      "cells": [
        "componyId",
        "53909614"
      ],
      "line": 8
    },
    {
      "cells": [
        "companyName",
        "泰迪軟體科技有限公司"
      ],
      "line": 9
    },
    {
      "cells": [
        "taxRate",
        "5"
      ],
      "line": 10
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 11
    },
    {
      "cells": [
        "itemNumber",
        "1"
      ],
      "line": 12
    },
    {
      "cells": [
        "itemDollar",
        "9527"
      ],
      "line": 13
    },
    {
      "cells": [
        "date",
        "2016 年 12 月 10 日"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click preview button and see the result of triplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 18
    },
    {
      "cells": [
        "date",
        "一 O 五 年 十一、十二 月 份"
      ],
      "line": 19
    },
    {
      "cells": [
        "companyName",
        "泰迪軟體科技有限公司"
      ],
      "line": 20
    },
    {
      "cells": [
        "companyId",
        "53909614"
      ],
      "line": 21
    },
    {
      "cells": [
        "year",
        "105"
      ],
      "line": 22
    },
    {
      "cells": [
        "month",
        "12"
      ],
      "line": 23
    },
    {
      "cells": [
        "day",
        "10"
      ],
      "line": 24
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 25
    },
    {
      "cells": [
        "itemCount",
        "1"
      ],
      "line": 26
    },
    {
      "cells": [
        "itemDollar",
        "9,527"
      ],
      "line": 27
    },
    {
      "cells": [
        "itemTotalDollar",
        "9,527"
      ],
      "line": 28
    },
    {
      "cells": [
        "salesDollar",
        "9,527"
      ],
      "line": 29
    },
    {
      "cells": [
        "businessTax",
        "476"
      ],
      "line": 30
    },
    {
      "cells": [
        "totalDollar",
        "10003"
      ],
      "line": 31
    },
    {
      "cells": [
        "numberWord",
        "壹零零零參"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "InvoiceStep.StartTUIApplication()"
});
formatter.result({
  "duration": 12833481956,
  "status": "passed"
});
formatter.match({
  "location": "InvoiceStep.EnterDataToTUI(String,String\u003e)"
});
formatter.result({
  "duration": 5254243725,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.21 seconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:48:19 -0700\u0027\nSystem info: host: \u0027DESKTOP-3DM6U7F\u0027, ip: \u0027140.124.181.196\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed), userDataDir\u003dC:\\Users\\wayne\\AppData\\Local\\Temp\\scoped_dir5548_27498}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 5c3f270cbcb9cf91ed6452c75dcb13ab\n*** Element info: {Using\u003did, value\u003dTUI_itemName}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat ALSD.CucumberTest.InvoiceStep.EnterDataToTUI(InvoiceStep.java:41)\r\n\tat ✽.When I enter the data into the form of triplicate uniform invoice(resources/invoice.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "InvoiceStep.ClickTUIPreviewButton(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 35,
  "name": "Duplicate Uniform Invoice",
  "description": "",
  "id": "test-invoice-preview;duplicate-uniform-invoice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "Open browser and open the application of duplicate uniform invoice",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I enter the data into the form of duplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 39
    },
    {
      "cells": [
        "companyName",
        "TeddySoft"
      ],
      "line": 40
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 41
    },
    {
      "cells": [
        "itemNumber",
        "2"
      ],
      "line": 42
    },
    {
      "cells": [
        "itemDollar",
        "9527"
      ],
      "line": 43
    },
    {
      "cells": [
        "date",
        "2016 年 12 月 10 日"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I click preview button and see the result of duplicate uniform invoice",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 48
    },
    {
      "cells": [
        "date",
        "一 O 五 年 十一、十二 月 份"
      ],
      "line": 49
    },
    {
      "cells": [
        "companyName",
        "TeddySoft"
      ],
      "line": 50
    },
    {
      "cells": [
        "year",
        "105"
      ],
      "line": 51
    },
    {
      "cells": [
        "month",
        "12"
      ],
      "line": 52
    },
    {
      "cells": [
        "day",
        "10"
      ],
      "line": 53
    },
    {
      "cells": [
        "itemName",
        "Education"
      ],
      "line": 54
    },
    {
      "cells": [
        "itemNumber",
        "2"
      ],
      "line": 55
    },
    {
      "cells": [
        "itemDollar",
        "9,527"
      ],
      "line": 56
    },
    {
      "cells": [
        "itemTotalDollar",
        "19,054"
      ],
      "line": 57
    },
    {
      "cells": [
        "totalDollar",
        "19,054"
      ],
      "line": 58
    },
    {
      "cells": [
        "numberWord",
        "壹玖零伍肆"
      ],
      "line": 59
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "InvoiceStep.StartDUIApplication()"
});
formatter.result({
  "duration": 9409302988,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.09 seconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:48:19 -0700\u0027\nSystem info: host: \u0027DESKTOP-3DM6U7F\u0027, ip: \u0027140.124.181.196\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed), userDataDir\u003dC:\\Users\\wayne\\AppData\\Local\\Temp\\scoped_dir12668_16826}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 61f0b169822c0a41705f0ec639566be3\n*** Element info: {Using\u003did, value\u003dDUI_button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat ALSD.CucumberTest.InvoiceStep.StartDUIApplication(InvoiceStep.java:103)\r\n\tat ✽.Given Open browser and open the application of duplicate uniform invoice(resources/invoice.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "InvoiceStep.EnterDataToDUI(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InvoiceStep.ClickDUIPreviewButton(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
});