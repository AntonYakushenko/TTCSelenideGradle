package test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FiveRequest extends TestBase {
    Pages pages = new Pages();

    @ParameterizedTest
    @ValueSource(strings = {"карта мап купить"/*, "карта мап купить спб","карточка мап купить","карточка мап купить спб"*/})
    void firstTest(String text) throws InterruptedException {
        pages.successfulSubmitFormTest(text);
    }
}
