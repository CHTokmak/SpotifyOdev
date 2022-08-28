package testmaster.selenium.com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testmaster.selenium.com.driver.Driver;
import testmaster.selenium.com.methods.Methods;

public class LoginPage extends Methods {

    private static final Logger logger = LogManager.getLogger(Driver.class);
    By Forgotalocator = By.id("reset-password-link");
    By ValidMail = By.id("login-username");

    By ValidPassword = By.id("login-password");

    By OturumButton = By.id("login-button");

    public LoginPage(WebDriver driver){

    }

    /*public boolean IsLoginPageOpen(){

        isElementVisible(Forgotalocator,30);
        return true;
    }*/

    public void Login(){

        Assertions.assertTrue(isElementVisible(Forgotalocator,30)); //Assertion of did we reach Login Page
        sendKeys(ValidMail,"canharuntokmak@hotmail.com");
        sendKeys(ValidPassword,"haroMaro2");
        clickElement(OturumButton);
        waitBySeconds(3);

    }





}

