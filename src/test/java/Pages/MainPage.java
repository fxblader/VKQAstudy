package Pages;

import Elements.ToolBarElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
public class MainPage extends BasePage {
    private static final By NAVIGATION_TOOLBAR = By.xpath(".//div[@class='topPanel']");
    private static final By OPEN_MUSIC = By.xpath(".//div[@class='toolbar_music-container']");
    private static final By MOMENTS_BUTTON = By.xpath(".//button[@data-l='t,to_moments']");
    private static final By HOBBY_BUTTON = By.xpath(".//button[@data-l='t,to_hobbies']");
    private static final By AVATAR = By.xpath(".//div[@class='card_wrp']");
    private static final By NAVIGATION_BAR = By.xpath(".//*[@id=\"hook_Block_Navigation\"]");

    public MainPage() {
        checkPage();
    }

    public ToolBarElement toolbar() {
        return new ToolBarElement();
    }

    public boolean isOpened(){
        $(NAVIGATION_BAR).shouldBe(visible.because("The navigation bar should be visible"));
        return true;
    }

    private void checkPage() {
        $(NAVIGATION_TOOLBAR).shouldBe(visible.because("The navigation toolbar should be visible"));
        $(NAVIGATION_BAR).shouldBe(visible.because("The navigation bar should be visible"));
        $(MOMENTS_BUTTON).shouldBe(visible.because("The moments button should be visible"));
        $(AVATAR).shouldBe(visible.because("The avatar should be visible"));
        $(HOBBY_BUTTON).shouldBe(visible.because("The hobby button should be visible"));
    }
}
