package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project.bdd.pages.AccountsPage;
import project.bdd.pages.PlansPage;
import project.bdd.utility.SeleniumUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsSteps extends SeleniumUtility {


    @When("Click on Accounts")
    public void Accounts() throws InterruptedException {
        clickOnElement(AccountsPage.ACCOUNTS);
        Thread.sleep(14000);
    }

    @Then("Verify {int} rows by default")
    public void verifyRowsDefaultPage(int expectedRows) {
        int actualRows = getListOfElements(AccountsPage.CHOSEN_ROW_SHOW).size();
        Assert.assertEquals("Validate table showing per page"
                , expectedRows, actualRows);
    }

    @When("choose show per page {string}")
    public void chooseShowRowPage(String expectedText) throws InterruptedException{

        clickOnElement(AccountsPage.ACCOUNTS_ROWS_SHOW);
        selectFromDropDown(AccountsPage.CHOOSE_ROW, expectedText);
        Thread.sleep(5000);

    }

    @Then("validate show per page match with present {int}")
    public void validateShowingPagePresent(int expectedRows) throws InterruptedException{
        int actualRows = getListOfElements(AccountsPage.CHOSEN_ROW_SHOW).size();
        Assert.assertEquals("Match what chosen with exist",
                expectedRows, actualRows);
        Thread.sleep(6000);


    }

}
