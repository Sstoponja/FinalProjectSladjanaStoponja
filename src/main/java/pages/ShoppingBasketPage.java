package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingBasketPage extends BasePage{

    public ShoppingBasketPage(WebDriver driver) {
        super(driver);
    }
    By checkoutButtonBy =By.id("checkout");

    public void proceedingToYourInformationPage(){
        clickElement(checkoutButtonBy);
    }
}
