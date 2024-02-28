package SeleniumActions;

import model.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static model.Application.driver;

public class FindAndClick {

    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement element = driver().findElement(By.cssSelector("a[href=\"/documentation/webdriver/\"]"));
        JavascriptExecutor jse2 = (JavascriptExecutor)driver();
        jse2.executeScript("arguments[0].scrollIntoView()", element);
        element.click();

        //Face click pe acel element
        Actions actions = new Actions(driver());
        actions.moveToElement(element).click().build().perform();

        //Cauta butonul "Add Element" si fa click pe el


        //Inchide applicatia
        Application.close();


    }

}
