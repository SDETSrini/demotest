$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/Test.feature");
formatter.feature({
  "name": "Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Hooks of the LoginPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@E2ENew"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User is on NewHomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefn.user_is_on_NewHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click on NewLogin Btn",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefn.user_Click_on_NewLogin_Btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});