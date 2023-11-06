@Regression
Feature: Navigate to Accounts section and validate rows and showing table records per page

  Background: Login with username and password and navigate to plans page
    When Click on button "Login"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click to "Sign In"
    And Click on Accounts

  @US_11
  Scenario: Navigate to Accounts verify 5 row per page is default
    Then Verify 5 rows by default

  @US_12
  Scenario Outline: Validate Showing per page is correct
    When choose show per page "<show>"
    Then validate show per page match with present <number>
    Examples:
    |show| number|
    |Show 10| 10|
    |Show 25| 25|
    |Show 50| 50|
