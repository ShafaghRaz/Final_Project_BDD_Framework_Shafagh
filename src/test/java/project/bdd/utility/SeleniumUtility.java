package project.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.bdd.base.BaseSetup;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    public boolean isElementExist(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isEnabled();
    }

    public WebElement waitUntilElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));

    }

    public void clickOnElement(By locator) {
        waitUntilElementClickable(locator).click();

    }

    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }

    public void enterValue(By locator, String text) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        element.sendKeys(text);

    }

    public void dropDownSelect(By locator, String text) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public List<WebElement> waitUntilVisibilityOfAllElements(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElements(locator);

    }

    public void selectFromDropDown(By locator, String option) {
        List<WebElement> itemPerPage = getListOfElements(locator);
        for (WebElement element : itemPerPage) {
            String text = element.getText();
            if (text.contains(option)) {
                element.click();
            }
        }
    }

    public byte[] takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);


    }

}
