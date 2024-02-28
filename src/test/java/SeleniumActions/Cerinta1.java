package SeleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cerinta1 {

//    cerinta_1:
//    Step 1: Click pe Add/Remove Elements de pe pagina principala
//    Step 2: Click pe butonul Add Element
//    Step 3: Sa se verifice display la butonul Delete
//    Step 4: Click pe button Delete
//    Step 5: Sa se verifice ca butonul Delete nu mai apare -> Foloseste assert
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    driver.getTitle();

    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

    WebElement textBox = driver.findElement(By.name("my-text"));
    WebElement submitButton = driver.findElement(By.cssSelector("button"));

    textBox.sendKeys("Selenium");
    submitButton.click();

    WebElement message = driver.findElement(By.id("message"));
    message.getText();

    driver.quit();
}

//    @Test
//    public void testCerinta1(){
//
// }
}
