package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project.bdd.pages.PlansPage;
import project.bdd.pages.UserProfilePage;
import project.bdd.utility.SeleniumUtility;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class PlansSteps extends SeleniumUtility {
    @When("Click on Plans")
    public void clickOnPlans() throws InterruptedException{
        clickOnElement(PlansPage.PLANS);
        Thread.sleep(600);

    }
    @Then("validate plans rows is {int}")
    public void validatePlansRows(int expectedRows) {
        int actualRows = getListOfElements(PlansPage.PLANS_ROWS).size();
        Assert.assertEquals("Number of plans rows",
                expectedRows ,actualRows);



    }


@When("user validate created date is today date EST time zone")
   public void validateCreatedDate() {
        List<WebElement> elements = getListOfElements(PlansPage.CREATED_DATE);
    LocalDate currentDate = LocalDate.now(ZoneId.of("US/Eastern"));
    String expectedDate = currentDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));
    for(WebElement element : elements){
        String actualDate = element.getText();
        Assert.assertEquals("Validate created date",
                expectedDate , actualDate );
    }




}

    @And("user validate expired date is a day after today date EST time zone")
    public void validateExpiredDate() {
        List<WebElement> elements = getListOfElements(PlansPage.EXPIRED_DATE);
        LocalDate currentDate = LocalDate.now(ZoneId.of("US/Eastern"));
        LocalDate dayAfterToday = currentDate.plusDays(1);
        String expectedDate = dayAfterToday.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));
        for(WebElement element : elements){
            String actualDate = element.getText();
            Assert.assertEquals("Validate expired date",
                    expectedDate, actualDate);
        }


    }






}
