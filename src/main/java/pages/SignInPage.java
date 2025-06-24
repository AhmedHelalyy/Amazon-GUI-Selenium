package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {


    private final WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By signInButton = By.xpath("//*[@id=\"nav-link-accountList\"]/a");
}
