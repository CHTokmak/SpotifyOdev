package testmaster.selenium.com.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testmaster.selenium.com.methods.Methods;

public class SongPage extends Methods {
    public SongPage(WebDriver driver){
    }
    public void addSongsToList(){

        // _____________ 1.Song //
        //scrollElement(By.xpath("//div[@aria-rowindex=\"1\"]"));
        waitBySeconds(1);
        rightClick(By.xpath("(//div[@data-testid=\"tracklist-row\"])[1]"));
        waitBySeconds(1);
        hoverElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[4]"));
        waitBySeconds(1);
        clickElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        waitBySeconds(1);
        // _____________ 2.Song //


        rightClick(By.xpath("(//div[@data-testid=\"tracklist-row\"])[2]"));
        waitBySeconds(1);
        hoverElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[4]"));
        waitBySeconds(2);
        clickElement(By.xpath("(//li[@role=\"presentation\"])[10]"));
        waitBySeconds(1);
        // _____________ 3.Song //

        waitBySeconds(1);
        rightClick(By.xpath("(//div[@data-testid=\"tracklist-row\"])[3]"));
        waitBySeconds(1);
        hoverElement(By.xpath("(//button[@class=\"wC9sIed7pfp47wZbmU6m\"])[4]"));
        waitBySeconds(2);
        clickElement(By.xpath("(//li[@role=\"presentation\"])[10]"));
        waitBySeconds(1);
        //Go to List//
        clickElement(By.xpath("(//li[@role=\"listitem\"])[1]"));
        waitBySeconds(3);



    }

}
