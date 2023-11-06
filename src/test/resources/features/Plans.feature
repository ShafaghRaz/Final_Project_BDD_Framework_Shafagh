@Regression
Feature: Navigate to plans and validate rows

  Background: Login with username and password and navigate to plans page
    When Click on button "Login"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click to "Sign In"
    And Click on Plans

  @US_9
  Scenario: Navigate to plans and validate 4 rows
    Then validate plans rows is 4


    @US_10
    Scenario: check the of create and expiration on plans
      When user validate created date is today date EST time zone
     And user validate expired date is a day after today date EST time zone


