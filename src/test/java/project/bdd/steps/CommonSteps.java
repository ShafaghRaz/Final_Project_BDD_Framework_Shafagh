package project.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import project.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {
    @Given("open browser and navigate")
    public void openBrowserAndNavigate(){
        openBrowser();
    }

    @Then("Validate application title should be {string}")
    public void validateApplicationTitle(String expectingAppTitle){
        String actualAppTitle = getDriver().getTitle();
        Assert.assertEquals("Application Title Validation",
                expectingAppTitle , actualAppTitle);



    }




    @Then("Close browser")
    public void closeBrowser(){
    driverQuit();

    }
}
