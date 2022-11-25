package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage extends BasePage{
    public YourInformationPage(WebDriver driver) {
        super(driver);
    }
    By firstNameBy = By.id("first-name");
    By lastNameBy = By.id("last-name");
    By postalCodeBy = By.id("postal-code");

    By continueButtonBy = By.id("continue");

    public void enterPersonalInformation(String firstName, String lastName, String postalCode) {
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(postalCodeBy, postalCode);

    }
    public void continueToOverview(){
        clickElement(continueButtonBy);
    }


}
