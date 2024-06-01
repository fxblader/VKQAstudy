package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    private static final By USER_TOOLBAR = By.xpath(".//*[@data-module=\"Toolbar\"]");
    private static final By EXIT_BUTTON = By.xpath(".//input[@data-l='t,logout']");
    private static final By CONFIRMATION_EXIT = By.xpath(".//*[@id=\"hook_FormButton_logoff.confirm_not_decorate\"]");

    public void logout() {
        $(USER_TOOLBAR).shouldBe(visible.
                because("The user toolbar button should be visible before clicking")).click();
        $(EXIT_BUTTON).shouldBe(visible.because("The exit button should be visible before clicking")).click();
        $(CONFIRMATION_EXIT).shouldBe(visible.because("The confirmation exit should be visible before clicking")).click();
    }
}
