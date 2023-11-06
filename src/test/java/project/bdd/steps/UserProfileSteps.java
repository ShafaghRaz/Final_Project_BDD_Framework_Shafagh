package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project.bdd.pages.LoginPage;
import project.bdd.pages.UserProfilePage;
import project.bdd.utility.SeleniumUtility;

import java.util.List;

public class UserProfileSteps extends SeleniumUtility {

    @When("Click to on profile button")
    public void clickToOpen() throws InterruptedException {
        clickOnElement(UserProfilePage.PROFILE_BUTTON);
        Thread.sleep(6000);
    }

    @Then("validate status {string}")
    public void validateStatus(String status) {
        String actualStatus = getElementText(UserProfilePage.STATUS);
        Assert.assertEquals("Validate status",
                status, actualStatus);

    }

    @Then("validate user type {string}")
    public void validateUserType(String userType) {
        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals("Validate status",
                userType, actualUserType);

    }

    @Then("validate name {string}")
    public void validateName(String name) {
        String actualName = getElementText(UserProfilePage.NAME);
        Assert.assertEquals("Validate status",
                name, actualName);

    }

    @Then("validate username {string}")
    public void validateUserName(String username) {
        String actualUsername = getElementText(UserProfilePage.USERNAME);
        Assert.assertEquals("Validate status",
                username, actualUsername);

    }

    @Then("validate authorities {string}")
    public void validateAuthorities(String authorities) throws InterruptedException {
        String actualAuthorities = getElementText(UserProfilePage.AUTHORITIES);
        Assert.assertEquals("Validate status",
                authorities, actualAuthorities);
        Thread.sleep(600);

    }


    @When("Click logout to back home page")
    public void clickLogout() throws InterruptedException {
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);
        Thread.sleep(5000);
    }

    @Then("Then user is on homepage {string}")
    public void UserOnHomePage(String expectedText) {
        String actualText = getElementText(UserProfilePage.HEADING_LOCATOR);
        Assert.assertEquals("Validate home page",
                expectedText, actualText);

    }
}
