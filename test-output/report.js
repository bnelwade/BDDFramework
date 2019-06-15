$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/BDDFramework/BDDFramework/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Testing of Free CRM",
  "description": "",
  "id": "login-page-testing-of-free-crm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Page Testing of Free CRM",
  "description": "",
  "id": "login-page-testing-of-free-crm;login-page-testing-of-free-crm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is alreay on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user get the title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_alreay_on_login_page()"
});
formatter.result({
  "duration": 13461381860,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 564994109,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 3080253835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_get_the_title()"
});
formatter.result({
  "duration": 9644327,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 2353621464,
  "status": "passed"
});
});