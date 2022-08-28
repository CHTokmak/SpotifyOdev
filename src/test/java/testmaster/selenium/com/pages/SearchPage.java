package testmaster.selenium.com.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testmaster.selenium.com.methods.Methods;

public class SearchPage extends Methods {



    public SearchPage(WebDriver driver){



    }

    public void searchSong(){

        Assertions.assertTrue(isElementVisible(By.xpath("//input[@data-testid='search-input']"),30));
        sendKeys(By.xpath("//input[@data-testid='search-input']"),"Daft Punk");
        Assertions.assertTrue(isElementVisible(By.xpath("(//div[@dir=\"auto\"])[2]"),30));
        waitBySeconds(1);
        clickElement(By.xpath("(//button[@role=\"checkbox\"])[3]"));
        waitBySeconds(1);

    }
}
