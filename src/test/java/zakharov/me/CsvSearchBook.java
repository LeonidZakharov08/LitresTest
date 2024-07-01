package zakharov.me;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.open;

public class CsvSearchBook {

    @BeforeEach
    void setup() {
        open("https://www.litres.ru");

        @CsvSource(value = {"биография", "история"})
        @ParameterizedTest(name = "В поисковой выдаче на litres должно отображаться 24 результата по запросу {0}")
    }
}

