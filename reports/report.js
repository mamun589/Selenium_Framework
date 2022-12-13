$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate Test Leaf Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.step({
  "name": "enter Username as \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "enter Password as \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "click the Logout button",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.launch_Chrome_Browser_and_Load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Username as DemoSalesManager",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_Username_as_DemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_Password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.click_the_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.launch_Chrome_Browser_and_Load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Username as DemoCSR",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_Username_as_DemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_Password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.click_the_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC003_CreatLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "Given "
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.step({
  "name": "Click CRM/SFA link",
  "keyword": "And "
});
formatter.step({
  "name": "Click Creat Lead link",
  "keyword": "And "
});
formatter.step({
  "name": "Enter company name as \u003ccompanyname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter first name as \u003cfirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter last name as \u003clastname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "click Create Lead button",
  "keyword": "And "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "companyname",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "ABC",
        "Hema",
        "Ma"
      ]
    },
    {
      "cells": [
        "XYZ",
        "He",
        "Mali"
      ]
    },
    {
      "cells": [
        "CBC",
        "Gopi",
        "Raj"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC003_CreatLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.launch_Chrome_Browser_and_Load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_username_as_DemoSalesManager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRM/SFA link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_CRM_SFA_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Creat Lead link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Creat_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter company name as ABC",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_company_name_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter first name as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_first_name_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter last name as Ma",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_last_name_as_Ma(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_CreatLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.launch_Chrome_Browser_and_Load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_username_as_DemoSalesManager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRM/SFA link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_CRM_SFA_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Creat Lead link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Creat_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter company name as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_company_name_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter first name as He",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_first_name_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter last name as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_last_name_as_Ma(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_CreatLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FUNCTIONAL"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome Browser and Load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.launch_Chrome_Browser_and_Load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_username_as_DemoSalesManager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRM/SFA link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_CRM_SFA_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Creat Lead link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Creat_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter company name as CBC",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_company_name_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter first name as Gopi",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_first_name_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter last name as Raj",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_last_name_as_Ma(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.click_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});