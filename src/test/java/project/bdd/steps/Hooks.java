package project.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.bdd.utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {


    @Before
    public void setUpTests() {
        openBrowser();
    }


    @AfterStep
    public void takeScreenShotAfterEachStep(Scenario scenario){
         byte[] screenshots = takeScreenShot();
         scenario.attach(screenshots, "image/png" , "screenShot");
    }


    @After
    public void closeUpTests(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] picture = takeScreenShot();
            scenario.attach(picture, "image/png", "failedScreenShot");
        }
        driverQuit();
    }
}
