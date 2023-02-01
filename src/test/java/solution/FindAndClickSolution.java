package solution;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindAndClickSolution {
    private By addRemoveElementHomePage = By.xpath("//a[@href='/add_remove_elements/']");
    @Test
    public void solutionForFindAndClick(){
        Application.start();

        Application.driver().findElement(addRemoveElementHomePage).click();
        //Cauta butonul "Add Element" si fa click pe el
        WebElement element = Application.driver().findElement(By.xpath("//button[@onclick='addElement()']"));
        element.click();

        //OR
        Application.driver().findElement(By.xpath("//button[@onclick='addElement()']")).click();

        Application.close();
    }
}
