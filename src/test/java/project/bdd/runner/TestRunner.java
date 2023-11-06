package project.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "project.bdd.steps",
        tags = "@Regression",
        dryRun = false,
        plugin = {
                "html:target/html_report/report.html",
                "json:target/jsonReports/report.json"
        }
)
public class TestRunner {

}
