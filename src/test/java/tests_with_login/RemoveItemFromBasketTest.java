package tests_with_login;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class RemoveItemFromBasketTest extends BaseTestWithLogin{

    @Test

    public void removeItemFromBasket(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addItemToBasket();
        productsPage.removeItemFromBasket();
        productsPage.verifyRemovingItem("ADD TO CART");
    }
}
