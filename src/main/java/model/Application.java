package model;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {
    //TO DO
    private static final String link = "https://www.selenium.dev/";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver driver() {
        return driver.get();
    }


    public static void start() {
        //TO DO: Set the path to driver - fill where is necessary
//        System.setProperty("webdriver.chrome.driver", "driver.chromedriver.exe");

        WebDriverManager.chromedriver().clearDriverCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver.set(new ChromeDriver(options));

        //TO DO: Set the URL
        driver().get(link);

    }

    public static void close() {
      driver().quit();

    }

}
