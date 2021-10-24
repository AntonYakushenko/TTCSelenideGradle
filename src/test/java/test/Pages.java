package test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Pages {
   private   SelenideElement
            search = $(byXpath("//input[@tabindex='2']"));

    static void openURL() {
        open("https://yandex.ru/");
    }

    static void clickTTC() {
        $(By.partialLinkText("ttc.com.ru")).click();
    }

     void successfulSubmitFormTest(String text) throws InterruptedException {
        Pages.openURL();
        search.setValue(text).pressEnter();
        Thread.sleep(2000);
        Pages.clickTTC();
        Thread.sleep(2000);
    }
}


