package project.bdd.pages;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class LoginPage {



    public final static By LOGIN_BUTTON = By.xpath("//div[1]/div[1]/div/a[2]/span");

    public final static By USERNAME = By.id("username");

    public final static By PASSWORD = By.id("password");

    public final static By SIGN_IN_BUTTON = By.xpath("//div[1]/div/div[2]//div/div/form//div[3]/button[1]");

    public final static By PAGE_BOTTOM = By.xpath("/html/body/div[1]/div/div[4]/div/div/p[1]");

    public final static By WRONG_CREDENTIAL = By.xpath("//div[@role='alert']");



}
