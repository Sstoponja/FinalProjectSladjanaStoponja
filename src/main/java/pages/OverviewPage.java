package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    By finishButtonBy = By.id("finish");

    public void finishingOrder(){
        clickElement(finishButtonBy);
    }
}
