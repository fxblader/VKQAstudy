package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MusicPage extends BasePage {
    private static final By PLAY_MUSIC = By.xpath(".//*[@class=\"play __active\"]");
    private static final By MUTE_BUTTON = By.xpath(".//*[@class=\"wm-player_action-volume\"]");
    private static final By TIME_LINE = By.xpath(".//*[@data-l=\"t,progress\"]");
    private static final By MY_MUSIC = By.xpath(".//*[data-l=\"t,library\"]");
    private static final By MUTED = By.xpath(".//*[@data-l=\"t,unmute\"]");
    private static final By MY_MUSIC_LABEL = By.xpath(".//*[@data-tsid=\"library_page_header\"]");

    public MusicPage(){
        checkPage();
    }

    public void setPlayMusic() {
        $(PLAY_MUSIC).shouldBe(visible.because("The play button should be visible")).click();
        sleep(3000);
    }

    public void offVolumeMusic() {
        $(MUTE_BUTTON).shouldBe(visible.because("The mute button should be visible")).click();
    }

    public boolean noVolume(){
        return $(MUTED).exists();
    }
    public static SelenideElement getMusicTime(){
        return $(TIME_LINE);
    }

    public void openMyMusic(){
        $(MY_MUSIC).shouldBe(visible.because("The my music button should be visible")).click();
    }
    public boolean myMusicOpen(){
        return  $(MY_MUSIC_LABEL).exists();

    }

    private void checkPage() {
        $(PLAY_MUSIC).shouldBe(visible.because("The play button should be visible"));
        $(MUTE_BUTTON).shouldBe(visible.because("The mute button should be visible"));
        $(TIME_LINE).shouldBe(visible.because("The time line should be visible"));
    }

}
