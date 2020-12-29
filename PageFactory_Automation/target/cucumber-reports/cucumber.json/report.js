$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ScenarioOutlneTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login function validations",
  "description": "",
  "id": "login-function-validations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login with data table",
  "description": "",
  "id": "login-function-validations;login-with-data-table",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As a user i can open any browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "As a user i can enter the  \"https://admin-demo.nopcommerce.com/\" and go to the login features",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "As a user i can enter as \"\u003cuserName\u003e\" and password \"\u003cpassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clik on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Homepage title should be \"Dashboard/nonCommerce administration\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "As a user i can click on Logout Link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Login page title should be \"Your store.Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-function-validations;login-with-data-table;",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ],
      "line": 15,
      "id": "login-function-validations;login-with-data-table;;1"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 16,
      "id": "login-function-validations;login-with-data-table;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Login with data table",
  "description": "",
  "id": "login-function-validations;login-with-data-table;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As a user i can open any browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "As a user i can enter the  \"https://admin-demo.nopcommerce.com/\" and go to the login features",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "As a user i can enter as \"admin@yourstore.com\" and password \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clik on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Homepage title should be \"Dashboard/nonCommerce administration\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "As a user i can click on Logout Link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Login page title should be \"Your store.Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OutLineTestStep.as_a_user_i_can_open_any_browser()"
});
formatter.result({
  "duration": 3600038500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/",
      "offset": 28
    }
  ],
  "location": "OutLineTestStep.as_a_user_i_can_enter_the_and_go_to_the_login_features(String)"
});
formatter.result({
  "duration": 25993860900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 26
    },
    {
      "val": "admin",
      "offset": 61
    }
  ],
  "location": "OutLineTestStep.as_a_user_i_can_enter_as_and_password(String,String)"
});
formatter.result({
  "duration": 311500,
  "error_message": "java.lang.NullPointerException\r\n\tat zoopla.uk.stepdefination.OutLineTestStep.as_a_user_i_can_enter_as_and_password(OutLineTestStep.java:30)\r\n\tat ✽.When As a user i can enter as \"admin@yourstore.com\" and password \"admin\"(ScenarioOutlneTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OutLineTestStep.clik_on_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard/nonCommerce administration",
      "offset": 26
    }
  ],
  "location": "OutLineTestStep.homepage_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OutLineTestStep.as_a_user_i_can_click_on_Logout_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store.Login",
      "offset": 28
    }
  ],
  "location": "OutLineTestStep.login_page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OutLineTestStep.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});