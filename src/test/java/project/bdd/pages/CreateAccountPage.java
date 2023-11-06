package project.bdd.pages;

import org.openqa.selenium.By;


public class CreateAccountPage {


    public final static By CREATE_ACCOUNT = By.xpath("//div[1]/div/div[2]/div/div/a");

    public final static By CREATE_ACCOUNT_TITLE = By.xpath("//body/div[1]/div/div[2]/div/div/div/h2");

    public final static By EMAIL_ADDRESS = By.id("email");

    public final static By TITLE_PREFIX = By.id("title");

    public final static By FIRST_NAME = By.id("firstName");

    public final static By LAST_NAME = By.id("lastName");

    public final static By GENDER = By.id("gender");

    public final static By MARITAL_STATUS = By.id("maritalStatus");

    public final static By EMPLOYMENT_STATUS = By.id("employmentStatus");

    public final static By DATE_OF_BIRTH = By.id("dateOfBirth");

    public final static By CREATE_ACCOUNT_BUTTON = By.xpath("//div[1]//div[2]//form//div[2]/button[1]");

    public final static By SIGNUP_HEADER = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[3]");

    public final static By ERROR_MESSAGE = By.xpath("//div[@role='alert']");
}
