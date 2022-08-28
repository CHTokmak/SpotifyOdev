package testmaster.selenium.com.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testmaster.selenium.com.methods.Methods;

public class HomePage extends Methods {
    public HomePage(WebDriver driver){


    }
    public boolean isHomePageOpen(){

        Assertions.assertTrue(isElementVisible(By.xpath("//button//span[text()='canharuntokmak']"),30));
        return true;
    }

    public void clickSearchBox(){

        clickElement(By.cssSelector("a[href*=\"search\"]"));
        waitBySeconds(3);
    }
    public void createPlayList(){

        clickElement(By.xpath("//button[@data-testid=\"create-playlist-button\"]"));
        Assertions.assertTrue(isElementVisible(By.xpath("//button//h1[@class=\"Type__TypeElement-goli3j-0 eczMAK\"]"),30));
        waitBySeconds(3);
    }

}
