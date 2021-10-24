package test;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class FiveRequest extends TestBase {

    SelenideElement
    search = $(byXpath("//input[@tabindex='2']"));
    
    static void openURL() {
        open("https://yandex.ru/");
    }
    static void clickTTC()  {
        $(By.partialLinkText("ttc.com.ru")).click();
    }



    @Test
    void successfulSubmitFormTest() throws InterruptedException {
        FiveRequest.openURL();
        search.setValue("карта мап купить").pressEnter();
        Thread.sleep(2000);
        FiveRequest.clickTTC();
        Thread.sleep(2000);
    }

    @Test
    void successfulSubmitFormTest2() throws InterruptedException {
        FiveRequest.openURL();
        search.setValue("карта мап купить спб").pressEnter();
        Thread.sleep(2000);
        FiveRequest.clickTTC();
        Thread.sleep(2000);
    }
    @Test
    void successfulSubmitFormTest3() throws InterruptedException {
        FiveRequest.openURL();
        search.setValue("карточка мап купить").pressEnter();
        Thread.sleep(2000);
        FiveRequest.clickTTC();
        Thread.sleep(2000);
    }

    @Test
    void successfulSubmitFormTest4() throws InterruptedException {
        FiveRequest.openURL();
        search.setValue("карточка мап купить спб").pressEnter();
        Thread.sleep(2000);
        FiveRequest.clickTTC();
        Thread.sleep(2000);
    }
}
