package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By productsTitleBy = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By menuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By addProductSauceLabsBackpackBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeProductSauceLabsBackpackBy = By.id("remove-sauce-labs-backpack");

    By shoppingBasketBy =By.className("shopping_cart_badge");

    public void verifyLogin(String expectedText) {
        String successLogin = readText(productsTitleBy);
        assertStringEquals(successLogin, expectedText);
    }
    public void logout(){
        clickElement(menuButtonBy);
        clickElement(logoutButtonBy);
    }
    public void addItemToBasket(){
        clickElement(addProductSauceLabsBackpackBy);
    }
    public void removeItemFromBasket(){
        clickElement(removeProductSauceLabsBackpackBy);
    }
    public void verifyRemovingItem (String expectedText) {
        assertStringEquals(readText(addProductSauceLabsBackpackBy), expectedText);
    }
    public void checkShoppingBasket(){
        clickElement(shoppingBasketBy);
    }

}
