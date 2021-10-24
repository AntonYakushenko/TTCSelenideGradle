package test;
import org.junit.jupiter.api.Test;

public class FiveRequest extends TestBase {

    Pages pages = new Pages();

    @Test
    void firstTest() throws InterruptedException {
        pages.successfulSubmitFormTest();
    }

    @Test
    void secondTest() throws InterruptedException {
        pages.successfulSubmitFormTest2();
    }

    @Test
    void thirdTest() throws InterruptedException {
        pages.successfulSubmitFormTest3();
    }

    @Test
    void fourthTest() throws InterruptedException {
        pages.successfulSubmitFormTest4();
    }
}
