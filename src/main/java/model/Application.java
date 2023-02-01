package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {

    private static final String link = "https://the-internet.herokuapp.com/";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        //Set the path to driver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver.set(new ChromeDriver(options));

        //Set the URL
        driver().get(link);


    }

    public static void close() {
        driver.get().quit();
    }

    public static void clearInput(WebElement input) {
        JavascriptExecutor js = (JavascriptExecutor) driver();
        js.executeScript("arguments[0].value= '';", input);
    }
}
