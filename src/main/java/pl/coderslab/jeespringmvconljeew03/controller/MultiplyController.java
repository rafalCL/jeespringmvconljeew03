package pl.coderslab.jeespringmvconljeew03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {
    @GetMapping("/tab1")
    public String tab1(@RequestParam(defaultValue = "10") int size,
                       Model m){
        m.addAttribute("size", size);

        return "tab1";
    }
}
