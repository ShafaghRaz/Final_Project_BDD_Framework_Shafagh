@Regression
Feature:Click on Create Primary Account Button and validate the header should be “Create Primary Account Holder”
  and create account and check header

  Background: Click on create account
    When Click on "create Primary Account"

  @US_2
  Scenario: Validate create account header title
    Then Validate the header title is "Create Primary Account Holder"

 @US_3
 Scenario: Create primary account and validate signup header page
   When Enter email address as "Shafagh.Razaghi1999@tekschool.us"
   And Choose title as "Mrs."
   And Enter first name as "Shafagh"
   And Enter last name as "Razaghi"
   And Choose gender as "Female"
   And Choose marital status as "Married"
   And Enter employment status as "Architect"
   And Enter date of birth as "01/01/1999"
   And Click on button of "Create Account"
   Then validate email is "Shafagh.Razaghi1999@tekschool.us"
  @US_4
  Scenario: Create account with existing email address and validate error message
    When Enter email address as "Shafagh.Razaghi1999@tekschool.us"
    And Choose title as "Mrs."
    And Enter first name as "Shafagh"
    And Enter last name as "Razaghi"
    And Choose gender as "Female"
    And Choose marital status as "Married"
    And Enter employment status as "Architect"
    And Enter date of birth as "01/01/1999"
    And Click on button of "Create Account"
    Then validate error message "Account with email Shafagh.Razaghi1999@tekschool.us is exist"


