package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Utilities {

    public static void takeScreenShot(WebDriver driver, String filePath) throws IOException {

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File(filePath));
    }

    public static void waitStrategyVisibility(WebDriver driver, By element, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitStrategyTextPresent(WebDriver driver, WebElement element, String text, int timeInSeconds) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public static void javaScriptExecutor(WebDriver driver, WebElement webElement, String script) {

        //String script = "arguments[0].scrollIntoView();";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript(script, webElement);
    }

    //    get absolute path of attachment
    public class getAbsolutePath {
        public static String generateAbsolutePath() {
            String projectPath = "src/test/resources/TestDataFiles/testImage.png";  // Relative path
            File file = new File(projectPath);
            String absolutePath = file.getAbsolutePath();
            return absolutePath;
        }

        public static String testImageAbsolutePath = generateAbsolutePath();
    }


//_______________________________________________________________________________________________________________________________________________________________

//    Explicit wait

    public static WebElement explicitWait(WebDriver driver, ExpectedCondition<WebElement> condition, long sec) {
        return new WebDriverWait(driver, Duration.ofSeconds(sec)).until(condition);

    }


    private static WebDriver driver;
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


//_______________________________________________________________________________________________________________________________________________________________

//    logger

    public class LoggerSetup {
        public static final Logger logger = Logger.getLogger(LoggerSetup.class.getName());

        static {
            try {
                // Console handler
                ConsoleHandler consoleHandler = new ConsoleHandler();
                consoleHandler.setLevel(Level.ALL);
                logger.addHandler(consoleHandler);

                // File handler
                java.util.logging.FileHandler fileHandler = new java.util.logging.FileHandler("selenium.log", true);
                fileHandler.setLevel(Level.ALL);
                fileHandler.setFormatter(new SimpleFormatter());
                logger.addHandler(fileHandler);

                logger.setLevel(Level.ALL);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error occurred in Logger Setup", e);
            }
        }

        public static Logger getLogger() {
            return logger;
        }
    }



//

    public static void waitForPageLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }
//

    //    get absolute path of attachment
    //    TODO complete function to get absolute path from repo root path

    public String testImagePath = "/Users/helaly/IdeaProjects/Caterk_SeleniumGUI_TestAutomation/src/main/java/utils/testData/File 2.jpeg";


}

