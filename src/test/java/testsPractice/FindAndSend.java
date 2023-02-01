package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FindAndSend {
    @Test
    public void findAndSendKeys() {
        Application.start();

        //Go to Form Authentication
        Application.driver().findElement(By.xpath("//a[@href='/login']")).click();

        //Gaseste campul username si insereaza username
        WebElement username = Application.driver().findElement(By.id("username"));
        username.sendKeys("tomsmith");


        //Challenge:Gaseste campul password si insereaza SuperSecretPassword!


        //Fa click pe butonul Login



        Application.close();

    }
}
