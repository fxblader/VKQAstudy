package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest extends BaseTest {
    private static final LoginPage loginPage = new LoginPage();
    private static MainPage mainPage;
    @Tag("Main")
    @DisplayName("Main page opening")
    @Test
    public void enteredSuccess(){
        mainPage = loginPage.login();
        assertTrue(mainPage.isOpened());
    }
}
