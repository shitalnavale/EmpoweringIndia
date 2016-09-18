$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EmpoweringIndiaHome.feature");
formatter.feature({
  "line": 2,
  "name": "Homepage",
  "description": "",
  "id": "homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@home"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "User on Home page",
  "description": "",
  "id": "homepage;user-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens homepage",
  "keyword": "* "
});
formatter.step({
  "line": 5,
  "name": "Verify if homepage is accesible",
  "keyword": "* "
});
formatter.match({
  "location": "HomePageStep.user_opens_homepage()"
});
formatter.result({
  "duration": 13886650161,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.verify_if_homepage_is_accesible()"
});
formatter.result({
  "duration": 30791,
  "status": "passed"
});
});