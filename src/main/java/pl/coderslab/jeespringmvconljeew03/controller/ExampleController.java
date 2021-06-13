package pl.coderslab.jeespringmvconljeew03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/home") // /example/home
    public String homeJsp() {
        return "/example/home.jsp";
    }
}
