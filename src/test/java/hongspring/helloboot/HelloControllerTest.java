package hongspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    void helloController(){

        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.Hello("Test");

        Assertions.assertThat(ret).isEqualTo("Test");

    }

    @Test
    void failsHelloController(){

        HelloController helloController = new HelloController(name -> name);

        Assertions.assertThatThrownBy(() -> {
            helloController.Hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() -> {
            helloController.Hello("");
        }).isInstanceOf(IllegalArgumentException.class);

    }
}
