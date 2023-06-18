package hongspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {

    public String Hello(String name) {
        return "Hello " + name;
    }
}
