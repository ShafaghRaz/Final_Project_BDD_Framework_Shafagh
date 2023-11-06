@Smoke @Regression
Feature: Sign in with username and password and validate header

  @US_5
  Scenario: Sign in with username and password and validate header
    When Click on button "Login"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click to "Sign In"
    Then Validate page has "TEK Insurance App is a Customer Portal Web application"

  @US_6
  Scenario Outline: Sign in with wrong username and password and validate header
    When Click on button "Login"
    When Enter username as "<username>"
    When Enter password as "<password>"
    When Click to "Sign In"
    Then Validate error message "<errorMessage>"
    Examples:
    |username |password | errorMessage |
    |supervisor1| tek_supervisor | User supervisor1 not found|
    |supervisor| tek_supervisor1 |Password not matched       |
    |supervisor1| tek_supervisor1|User supervisor1 not found |



