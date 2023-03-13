import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class DragAndDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void dragAndDropTest() throws InterruptedException {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b").should(text("A"));
        $("#column-a").should(text("B"));
        sleep(5000);
    }
}