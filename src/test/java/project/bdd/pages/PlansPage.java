package project.bdd.pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;

public class PlansPage {

    public final static By PLANS = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]");


    public final static By PLANS_ROWS = By.xpath("//table/tbody/tr");


    public final static By CREATED_DATE  = By.xpath("//tbody/tr/td[4]");

    public final static By EXPIRED_DATE = By.xpath("//tbody/tr/td[5]");
}
