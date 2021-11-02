package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import helpers.Attach;

import static java.lang.String.format;

public class TestBase {

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        String browser = System.getProperty("browser","chrome");

        //String browserURL = System.getProperty("url","https://user1:1234@selenoid.autotests.cloud/wd/hub/");
        //Configuration.remote = format("https://%s:%s", login, password, browserURL);

        Configuration.browser = browser;
        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = "1920x1080";
        //Configuration.remote = format("https://user1:1234@%s", browserURL);
       // Configuration.remote = browserURL;
        Configuration.remote = "http://137.184.95.234:4444/wd/hub";
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        //Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}