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

     void successfulSubmitFormTest() throws InterruptedException {
        Pages.openURL();
        search.setValue("карта мап купить").pressEnter();
        Thread.sleep(2000);
        Pages.clickTTC();
        Thread.sleep(2000);
    }
    void successfulSubmitFormTest2() throws InterruptedException {
        Pages.openURL();
        search.setValue("карта мап купить спб").pressEnter();
        Thread.sleep(2000);
        Pages.clickTTC();
        Thread.sleep(2000);
    }
    void successfulSubmitFormTest3() throws InterruptedException {
        Pages.openURL();
        search.setValue("карточка мап купить").pressEnter();
        Thread.sleep(2000);
        Pages.clickTTC();
        Thread.sleep(2000);
    }
    void successfulSubmitFormTest4() throws InterruptedException {
        Pages.openURL();
        search.setValue("карточка мап купить спб").pressEnter();
        Thread.sleep(2000);
        Pages.clickTTC();
        Thread.sleep(2000);
    }
}


