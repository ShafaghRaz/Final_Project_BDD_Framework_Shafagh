@Smoke @Regression
Feature: Navigate to costumer service portal and validate information of costumer

  Background: Login with username and password
    When Click on button "Login"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click to "Sign In"
    When Click to on profile button

  @US_7
  Scenario: Validate information on profile information
    Then validate status "Active"
    Then validate user type "CSR"
    Then validate name "Supervisor"
    Then validate username "supervisor"
    Then validate authorities "admin"


  @US_8
  Scenario: Validate information on profile information
    When Click logout to back home page
    Then Then user is on homepage "Lets get you started"


