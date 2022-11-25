package tests_with_login;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LogoutTest extends BaseTestWithLogin{

    @Test

    public void logout() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.logout();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogout("Password for all users:");

        }
    }


