package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.Utilities.waitStrategyVisibility;


public class CategoriesPage {

    private final WebDriver driver;

    public CategoriesPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By seeAllButton = By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[3]/ul/li[5]/a[1]");
    private By videoGameList = By.xpath("//*[@id=\"hmenu-content\"]/div[1]/section[3]/ul/ul/li[10]/a");
    private By allVideoGamesLocator = By.xpath("//a[contains(text(),'All Video Games')]");


    //------

    public void clickOnAllCategoriesMenu() {
        waitStrategyVisibility(driver,seeAllButton,10);
        driver.findElement(seeAllButton).click();
    }

    public void clickOnVideoGameMenu() {
        waitStrategyVisibility(driver,videoGameList,10);
        driver.findElement(videoGameList).click();
    }


    public AllVideoGamesPage clickOnAllVideoGames() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(allVideoGamesLocator)
        );

        // Scroll to the element to make sure it's visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        return new AllVideoGamesPage(driver);
    }






}
