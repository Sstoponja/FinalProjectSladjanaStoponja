package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletedOrderPage extends BasePage {
    public CompletedOrderPage(WebDriver driver) {
        super(driver);
    }

    By backHomeButtonBy = By.id("back-to-products");

    public void verifyShopping(String expectedText) {
        assertStringEquals(readText(backHomeButtonBy), expectedText);

    }
}