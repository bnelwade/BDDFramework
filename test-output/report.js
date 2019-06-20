$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/BDDFramework/BDDFramework/src/main/java/Features/SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Test of FB",
  "description": "",
  "id": "signup-test-of-fb",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "SignUp Test",
  "description": "",
  "id": "signup-test-of-fb;signup-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on signUp page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname and lastname and mobno and password",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "mobno",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "balasaheb",
        "nelwade",
        "8793740818",
        "bala@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStep.user_is_already_on_signUp_page()"
});
formatter.result({
  "duration": 10577316451,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStep.user_enters_firstname_and_lastname_and_mobno_and_password(DataTable)"
});
formatter.result({
  "duration": 2187721963,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStep.user_click_on_submit_button()"
});
formatter.result({
  "duration": 2140409082,
  "status": "passed"
});
});