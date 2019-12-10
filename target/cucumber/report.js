$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/Test.feature");
formatter.feature({
  "name": "Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify first of the LoginPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2ENew"
    }
  ]
});
formatter.step({
  "name": "User is on NewHomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefn.user_is_on_NewHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on NewLogin Btn",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefn.user_Click_on_NewLogin_Btn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify second of the LoginPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2ENew"
    }
  ]
});
formatter.step({
  "name": "User is on NewHomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefn.user_is_on_NewHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on NewLogin Btn",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefn.user_Click_on_NewLogin_Btn()"
});
formatter.result({
  "status": "passed"
});
});