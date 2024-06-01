package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    private static final String LOGIN = "technopol62";
    private static final String PASSWORD = "technopolisPassword";
    private static final By LOGIN_INPUT = By.xpath(".//*[@id=\"field_email\"]");
    private static final By PASSWORD_INPUT = By.xpath(".//*[@id=\"field_password\"]");
    private static final By LOGIN_BUTTON = By.xpath(".//*[@data-l='t,sign_in']");
    private static final By RESTORE_BUTTON = By.xpath(".//*[@data-l='t,restore']");
    private static final By QR_BUTTON = By.xpath(".//*[@data-l='t,get_qr']");
    private static final By ERROR_LOGIN = By.xpath(".//*[class=\"input-e login_error\"]");


    public LoginPage() {
        checkPage();
    }

    public MainPage login() {
        $(LOGIN_INPUT).shouldBe(visible.because("The log in input should be visible")).setValue(LOGIN);
        $(PASSWORD_INPUT).shouldBe(visible.because("The password input should be visible")).setValue(PASSWORD);
        $(LOGIN_BUTTON).shouldBe(visible.because("The sign in button should be visible before clicking")).click();
        return new MainPage();
    }


    public MainPage login(String login, String password){
        $(LOGIN_INPUT).shouldBe(visible.because("The log in input should be visible")).setValue(login);
        $(PASSWORD_INPUT).shouldBe(visible.because("The password input should be visible")).setValue(password);
        $(LOGIN_BUTTON).shouldBe(visible.because("The sign in button should be visible before clicking")).click();
        return new MainPage();
    }

    private void checkPage() {
        $(LOGIN_BUTTON).shouldBe(visible.because("The log in button should be visible"));
        $(RESTORE_BUTTON).shouldBe(visible.because("The restore button should be visible"));
        $(QR_BUTTON).shouldBe(visible.because("The QR button should be visible"));
    }



}
