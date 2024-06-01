package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {
    private static final String URL = "https://ok.ru/";

    @BeforeAll
    public static void start() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = URL;
    }
    @BeforeEach
    public void Setup() {
        open("/");
    }
    @AfterEach
    public void Close() {
        Selenide.closeWindow();
    }
}

