package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utilities.PropertyManager;

public class BaseTestWithLogin {
    public WebDriver driver;

    @BeforeMethod

    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications", "--start-maximized"));

        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage =new LoginPage(driver);
        loginPage.login(PropertyManager.getInstance().getValidUsername(),PropertyManager.getInstance().getValidPassword());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

