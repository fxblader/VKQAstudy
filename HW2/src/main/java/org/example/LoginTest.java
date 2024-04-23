package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginTest {

    private final String OK_URL = "https://ok.ru/";

    @BeforeEach
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;


    }

    @Test
    public void testLogin() {
        Selenide.open(OK_URL);
        String username = "technopol62";
        String password = "technopolisPassword";


        $x("//*[@id=\"field_email\"]").sendKeys(username);
        $x("//*[@id=\"field_password\"]").sendKeys(password);

        $(byValue("Log in to OK")).click();

        $x("//*[@id=\"toolbar_search\"]/toolbar-search/form/div/label/input").should(exist);
        }

    @Test
    public void testLoginFailed() {
        Selenide.open(OK_URL);
        String username = "wrongLogin";
        String password = "wrongPassword";


        $x("//*[@id=\"field_email\"]").sendKeys(username);
        $x("//*[@id=\"field_password\"]").sendKeys(password);

        $(byValue("Log in to OK")).click();

        $(byValue("Log in to OK")).should(exist);

    }

    @Test
    public void testOpenMessanges() {

        Selenide.open(OK_URL);
        String username = "technopol62";
        String password = "technopolisPassword";


        $x("//*[@id=\"field_email\"]").sendKeys(username);
        $x("//*[@id=\"field_password\"]").sendKeys(password);

        $(byValue("Log in to OK")).click();

        $x("//*[@id=\"hook_ToolbarIconDiscussions_ToolbarDiscussions\"]").click();

        $x("//*[@id=\"d-f-tab-fAl\"]/span").shouldHave(exactText("All"));


    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}