@Smoke @Regression
Feature: Testing application title and validate create account button is clickable


  @US_1
  Scenario: Home page title is TEK Insurance UI and create Primary Account Button is exist
    Then Validate application title should be "Tek Insurance UI"
    Then "create Primary Account" button is exist
