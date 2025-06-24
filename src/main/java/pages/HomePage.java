package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.Utilities.waitStrategyVisibility;

//import static utils.Utilities.*;

public class HomePage {


    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By signInButton = By.xpath("//*[@id=\"nav-link-accountList\"]/a");

    public SignInPage clickOnSignInButton() {
        waitStrategyVisibility(driver,signInButton,10 );
        driver.findElement(signInButton).click();
        return new SignInPage(driver);
    }


}
