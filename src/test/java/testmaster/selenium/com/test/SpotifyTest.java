package testmaster.selenium.com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testmaster.selenium.com.driver.Driver;
import testmaster.selenium.com.pages.*;

public class SpotifyTest extends Driver {


    @Test
    public void loginTest(){
        // Driver Activation
        GuestPage guestPage = new GuestPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        SongPage songPage = new SongPage(driver);
        PlayListPage playListPage = new PlayListPage(driver);
        String URL = driver.getCurrentUrl();
        Assertions.assertEquals(URL, "https://open.spotify.com/" ,"Doğru Url");
        guestPage.clickSignUp();
        loginPage.Login();
        homePage.isHomePageOpen();
        homePage.createPlayList();
        playListPage.giveDetailsList();
        searchPage.searchSong();
        songPage.addSongsToList();
        playListPage.playListSolutions();




    }

}
