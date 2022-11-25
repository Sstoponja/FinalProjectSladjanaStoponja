package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{

    @Test(dataProvider = "failedLogin")
    public void failedLogin(String username, String password, String error) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
       try {
           loginPage.verifyFailedLogin(error);
           System.out.println("Sve radi kao podmazano");
       }catch (Exception e){
           Assert.fail();
       }
    }

    @DataProvider (name = "failedLogin")
    public Object [][]getDataFromDataProvider(){
        return new Object [][]
                {
                        { "",PropertyManager.getInstance().getValidPassword(),"Epic sadface: Username is required"},
                        {PropertyManager.getInstance().getValidUsername(),"","Epic sadface: Password is required"},
                        {PropertyManager.getInstance().getInvalidUsername(),PropertyManager.getInstance().getInvalidPassword(), "Epic sadface: Username and password do not match any user in this service"}

                };
    }
}
