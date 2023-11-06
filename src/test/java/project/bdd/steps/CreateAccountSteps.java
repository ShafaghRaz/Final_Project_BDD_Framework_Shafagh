package project.bdd.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import project.bdd.pages.CreateAccountPage;
import project.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {


    @Then("{string} button is exist")
    public void buttonIsExist(String expectedCondition) {
        boolean actualCondition = isElementExist(CreateAccountPage.CREATE_ACCOUNT);
        if (expectedCondition.equalsIgnoreCase("enabled")) {
            Assert.assertTrue("Button should be enabled", actualCondition);
        } else if (expectedCondition.equalsIgnoreCase("disabled")) {
            Assert.assertTrue("Bottun should be disabled", actualCondition);
        }
    }

    @When("Click on {string}")
    public void clickOn(String button) throws InterruptedException{
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT);
        Thread.sleep(100);


    }

    @Then("Validate the header title is {string}")
    public void validateHeaderTitleOfPrimaryAccount(String expectedHeaderTitle) {
        String actualHeaderTitle = getElementText(CreateAccountPage.CREATE_ACCOUNT_TITLE);
        Assert.assertEquals("Validate header title" ,
                expectedHeaderTitle , actualHeaderTitle);

    }

    @When("Enter email address as {string}")
    public void enterEmailAddress(String email) {
        enterValue(CreateAccountPage.EMAIL_ADDRESS, email);

    }
    @When("Choose title as {string}")
    public void chooseTitle(String title) {
        dropDownSelect(CreateAccountPage.TITLE_PREFIX, title);

    }
    @When("Enter first name as {string}")
    public void enterFirstName(String firstName) {
        enterValue(CreateAccountPage.FIRST_NAME, firstName);

    }
    @When("Enter last name as {string}")
    public void enterLastName(String lastName) {
        enterValue(CreateAccountPage.LAST_NAME, lastName);

    }
    @When("Choose gender as {string}")
    public void chooseGender(String gender) {
        dropDownSelect(CreateAccountPage.GENDER, gender);

    }
    @When("Choose marital status as {string}")
    public void chooseMaritalStatus(String maritalStatus) {
        dropDownSelect(CreateAccountPage.MARITAL_STATUS, maritalStatus );
    }
    @When("Enter employment status as {string}")
    public void enterEmploymentStatus(String employmentStatus) {
        enterValue(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);

    }
    @When("Enter date of birth as {string}")
    public void enter_date_of_birth_as(String dateOfBirth) {
        enterValue(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);

    }
    @When("Click on button of {string}")
    public void clickOnButton(String button) throws InterruptedException{
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
        Thread.sleep(200);

    }
    @Then("validate email is {string}")
    public void validatePageHeader(String expectedTitle) {
        String actualTitle = getElementText(CreateAccountPage.SIGNUP_HEADER);
        Assert.assertEquals("Validate header title",
                expectedTitle , actualTitle);
    }
    @Then("validate error message {string}")
    public void validateErrorMessage(String error) {
        String actualError = getElementText(CreateAccountPage.ERROR_MESSAGE);
        Assert.assertEquals("Validate error message" ,
                "ERROR\n"+error , actualError);
    }

}
