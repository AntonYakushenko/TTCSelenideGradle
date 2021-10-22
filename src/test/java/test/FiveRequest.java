package test;

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

    @ParameterizedTest
    @ValueSource(strings = {"карта мап купить", "карта мап купить спб","карточка мап купить","карточка мап купить спб"})
    void successfulSubmitFormTest(String text) throws InterruptedException {

        open("https://yandex.ru/");

        $(byXpath("//input[@tabindex='2']")).setValue(text).pressEnter();
        Thread.sleep(2000);
        $(By.partialLinkText("ttc.com.ru")).click();
        Thread.sleep(2000);

    }
}
