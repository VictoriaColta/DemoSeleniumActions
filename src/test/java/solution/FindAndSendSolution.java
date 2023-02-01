package solution;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindAndSendSolution {
    private By formAuthentication = By.xpath("//a[@href='/login']");

    @Test
    public void solutionForFindAndSendKeys(){
        Application.start();
        //Click pe Form Authentication
        Application.driver().findElement(formAuthentication).click();

        //Gaseste campul username si insereaza username
        WebElement username = Application.driver().findElement(By.id("username"));
        username.sendKeys("tomsmith");


        //Challenge:Gaseste campul password si insereaza SuperSecretPassword!
        Application.driver().findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        Application.driver().findElement(By.xpath("//button[@type = 'submit']")).click();

    }
}
