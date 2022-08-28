package testmaster.selenium.com.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testmaster.selenium.com.methods.Methods;

public class GuestPage extends Methods {
    public GuestPage(WebDriver driver){

    }

    public void clickSignUp(){
        clickElement(By.xpath("//button[@data-testid='login-button']"));
        waitBySeconds(3);


    }
}
