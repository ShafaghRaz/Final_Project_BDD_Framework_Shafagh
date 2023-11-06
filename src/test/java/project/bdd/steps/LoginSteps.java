package project.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.CreateAccountPage;
import project.bdd.pages.LoginPage;
import project.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {
    @When("Click on button {string}")
    public void clickOnLogin(String button) throws InterruptedException {
        clickOnElement(LoginPage.LOGIN_BUTTON);
        Thread.sleep(5000);
    }

    @When("Enter username as {string}")
    public void enterUsername(String userName) {
        enterValue(LoginPage.USERNAME, userName);
    }

    @When("Enter password as {string}")
    public void enterPassword(String passWord) {
        enterValue(LoginPage.PASSWORD, passWord);
    }

    @When("Click to {string}")
    public void clickOnSignIn(String button) throws InterruptedException {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
        Thread.sleep(500);
    }

    @Then("Validate page has {string}")
    public void validatePageHeader(String expectedTitle) {
        String actualTitle = getElementText(LoginPage.PAGE_BOTTOM);
        Assert.assertEquals("Costumer portal validation",
                expectedTitle, actualTitle);
    }

    @Then("Validate error message {string}")
    public void validateErrorMessage(String error) {
        String actualError = getElementText(LoginPage.WRONG_CREDENTIAL);
        Assert.assertEquals("Error message validation",
                "ERROR\n"+error , actualError);

    }

}
