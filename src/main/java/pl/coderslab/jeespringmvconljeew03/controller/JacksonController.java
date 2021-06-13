package pl.coderslab.jeespringmvconljeew03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.jeespringmvconljeew03.model.Product;

@RestController
public class JacksonController {
    @GetMapping("/jackson")
    public Product jackson(){
        return new Product("prodname", 12.34);
    }

    @PostMapping("/jacksonpost")
    public String encoding(@RequestBody Product product){
        return product.toString();
    }
}
