package Tests;

import Pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {
    private static final LoginPage loginPage = new LoginPage();
    @Tag("Login")
    @ParameterizedTest
    @DisplayName("Successful login check")
    @CsvSource({"technopol62, technopolisPassword", "aetgs, fhrhjs"})
    public void loginCheck(String login, String password){
        if (login == "technopol62") assertTrue(loginPage.login(login, password).isOpened());
        else assertFalse(loginPage.login(login, password).isOpened());
    }
}
