package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{

    @Test

    public void login(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login(PropertyManager.getInstance().getValidUsername(),PropertyManager.getInstance().getValidPassword());
        ProductsPage productsPage =new ProductsPage(driver);
        productsPage.verifyLogin("PRODUCTS");
    }
}
