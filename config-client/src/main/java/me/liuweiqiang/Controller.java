package me.liuweiqiang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${precedence.test}")
    private String a;

    @RequestMapping("/")
    public String home() {
        return a;
    }
}
