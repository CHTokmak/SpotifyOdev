package testmaster.selenium.com.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import testmaster.selenium.com.methods.Methods;

public class PlayListPage extends Methods {

    public PlayListPage(WebDriver driver) {

    }
    public void giveDetailsList(){

        clickElement(By.xpath("//button//h1[@class=\"Type__TypeElement-goli3j-0 eczMAK\"]"));
        Assertions.assertTrue(isElementVisible(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"]"),30));
        sendKeys(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"]"), String.valueOf(Keys.DELETE));
        sendKeys(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"]"),"Spotify Listem");
        waitBySeconds(1);
        clickElement(By.xpath("//button[@data-testid=\"playlist-edit-details-save-button\"]"));
        waitBySeconds(3);
        Assertions.assertTrue(isElementVisible(By.xpath("(//span[@dir=\"auto\"])[2]"),30)); // (//span[@dir="auto"])[2] this adresses the last created playlist
        clickElement(By.cssSelector("a[href*=\"search\"]"));
        waitBySeconds(2);


    }

    public void playListSolutions(){
        scrollElementCenter(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]")) ;
        waitBySeconds(3);
        hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[2]"));
        waitBySeconds(1);
        clickElement(By.xpath("(//button[@class=\"RfidWIoz8FON2WhFoItU\"])[2]"));
        waitBySeconds(10);
        clickElement(By.xpath("(//button[@aria-label=\"Duraklat\"])[1]"));
        waitBySeconds(1);
        Assertions.assertFalse(isElementVisible(By.xpath("(//button[@aria-label=\"Duraklat\"])[1]"),5));
        //------ Delete 3. Song//
        hoverElement(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]"));
        waitBySeconds(1);
        clickElement(By.xpath("(//button[@data-testid=\"more-button\"])[4]"));
        waitBySeconds(1);
        waitBySeconds(1);
        clickElement(By.xpath("(//button[@role=\"menuitem\"])[6]"));
        waitBySeconds(1);
        Assertions.assertFalse(isElementVisible(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]"),5));
        //------ Delete List//
        scrollElement(By.xpath("//button[@aria-label=\"Spotify Listem – Ayrıntıları düzenler\"]")); ;
        clickElement(By.xpath("//button[@aria-label=\"Spotify Listem için diğer seçenekler\"]"));
        clickElement(By.xpath("(//button[@role=\"menuitem\"])[5]"));
        waitBySeconds(1);
        clickElement(By.xpath("//button//span[@class=\"ButtonInner-sc-14ud5tc-0 jHsQoF encore-bright-accent-set\"]"));
        waitBySeconds(2);
        Assertions.assertTrue(isElementVisible(By.xpath("(//a[@aria-current=\"page\"])[1]"),30));


    }


}
