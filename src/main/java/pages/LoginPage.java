package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By errorNotificationBy =By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");

    By passwordForAllUsersBy =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4");
    public void login(String username, String password){
        writeText(usernameFieldBy, username);
        writeText(passwordFieldBy, password);
        clickElement(loginButtonBy);
    }
    public void verifyFailedLogin(String expectedText){
        String error = readText(errorNotificationBy);
        assertStringEquals(error, expectedText);
    }

    public void verifyLogout (String expectedText) {
        assertStringEquals(readText(passwordForAllUsersBy), expectedText);
    }

}
