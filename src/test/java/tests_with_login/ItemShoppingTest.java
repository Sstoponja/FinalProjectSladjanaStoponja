package tests_with_login;

import org.testng.annotations.Test;
import pages.*;
import utilities.PropertyManager;

public class ItemShoppingTest extends BaseTestWithLogin{

    @Test

    public void shoppingItem(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addItemToBasket();
        productsPage.checkShoppingBasket();
        ShoppingBasketPage shoppingBasketPage = new ShoppingBasketPage(driver);
        shoppingBasketPage.proceedingToYourInformationPage();
        YourInformationPage yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.enterPersonalInformation(PropertyManager.getInstance().getFirstName(),
                                                     PropertyManager.getInstance().getLastName(),
                                                     PropertyManager.getInstance().getPostalCode());
        yourInformationPage.continueToOverview();
        OverviewPage overviewPage = new OverviewPage(driver);
        overviewPage.finishingOrder();
        CompletedOrderPage completedOrderPage = new CompletedOrderPage(driver);
        completedOrderPage.verifyShopping("BACK HOME");

    }
}
