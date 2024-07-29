package definitions;

import io.cucumber.java.Before;
import io.cucumber.java8.En;
import org.junit.jupiter.api.BeforeAll;

public class Basehooks implements En {

    public Basehooks() {
        Before("@ui", 0, () -> {

        });
    }
}
