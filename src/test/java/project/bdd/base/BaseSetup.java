package project.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {

    private static WebDriver driver;

    public void openBrowser() {
        String configFilePath = System.getProperty("user.dir") + "/src/test/resources/configs/dev_env_configs.properties";
        Properties properties = new Properties();
        try {
            FileInputStream configFiles = new FileInputStream(configFilePath);
            properties.load(configFiles);

        } catch (IOException e) {
            e.printStackTrace();
        }
        String baseUrl = properties.getProperty("ui.url");
        String browserType = properties.getProperty("ui.browser.type");

        if (browserType.equalsIgnoreCase("chrome")) {
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--headless");
            driver = new ChromeDriver(option);
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Wrong browser type");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);

    }

    public void driverQuit() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        if (driver != null)
            driver.quit();
    }

    public static WebDriver getDriver() {

        return driver;
    }
}
