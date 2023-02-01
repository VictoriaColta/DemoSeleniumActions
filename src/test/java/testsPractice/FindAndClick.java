package testsPractice;

import model.Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindAndClick {

    @Test
    public void findElementAndClick() {
        //Deschide browser si deschide applicatia web
        Application.start();

        //cauta un singur element si il salveaza intr-o variabila de tip WebElement
        WebElement homeElement = Application.driver().findElement(By.xpath("//a[@href='/add_remove_elements/']"));

        //Face click pe acel element
        homeElement.click();

        //Cauta butonul "Add Element" si fa click pe el
//Your code goes here------------------


        //Inchide applicatia
        Application.close();


    }

}
