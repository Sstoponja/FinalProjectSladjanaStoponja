package utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
    private static String validUsername, validPassword, invalidUsername, invalidPassword, firstName, lastName, postalCode;

    public static PropertyManager getInstance() {
        PropertyManager instance = new PropertyManager();
        Properties properties = new Properties();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);

        } catch (Exception e) {
            e.printStackTrace();
        }
        invalidUsername = properties.getProperty("invalidUsername");
        invalidPassword = properties.getProperty("invalidPassword");
        validUsername = properties.getProperty("validUsername");
        validPassword = properties.getProperty("validPassword");
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        postalCode = properties.getProperty("postalCode");

        return instance;
    }

    public String getValidUsername() {
        return validUsername;
    }

    public String getValidPassword() {
        return validPassword;
    }

    public String getInvalidUsername() {
        return invalidUsername;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getPostalCode() {
        return postalCode;
    }
}
