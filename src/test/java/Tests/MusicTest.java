package Tests;

import Pages.LoginPage;
import Pages.MusicPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicTest extends BaseTest {
    private static final LoginPage loginPage = new LoginPage();
    private static MusicPage musicPage;

    @Tag("Music")
    @DisplayName("Mute music")
    @Test
    public void muteSound(){
        musicPage = loginPage.login().openMusic();
        musicPage.offVolumeMusic();
        assertTrue(musicPage.noVolume());
    }
    @Tag("Music")
    @DisplayName("Play music")
    @Test
    public void playMusic(){
        musicPage = loginPage.login().openMusic();
        musicPage.setPlayMusic();
        assertNotEquals(musicPage.getMusicTime().getAttribute("current-time"), "0");
    }
}
