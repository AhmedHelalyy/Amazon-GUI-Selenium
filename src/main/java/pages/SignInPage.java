package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.Utilities.explicitWait;
import static utils.Utilities.waitStrategyVisibility;

public class SignInPage {


    private final WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By phoneNumberField = By.xpath("//*[@id=\"ap_email_login\"]");
    private By continueButton = By.xpath("//*[@id=\"continue\"]/span/input");
    private By passwordField = By.xpath("//*[@id=\"ap_password\"]");





    public void setPhoneNumberField(String phoneNumber)
    {
        waitStrategyVisibility(driver,phoneNumberField,10 );
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }


    public void clickOnContinueButton() {
//         Use explicitWait with the required parameters: driver, condition, and timeout as int (cast to long)
        explicitWait(driver, ExpectedConditions.elementToBeClickable(continueButton), 10L);
        driver.findElement(continueButton).click();
    }

    public void setPasswordField(String password)
    {
        waitStrategyVisibility(driver,passwordField,10 );
        driver.findElement(passwordField).sendKeys(password);
    }
}
