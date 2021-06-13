package pl.coderslab.jeespringmvconljeew03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

// W widoku home.jsp dodaj tag style. Tag powinien zawierać selector body, który ustawia dwie właściwości color i backgroundColor.
//Wartościami tych parametrów powinny być wartości color i backgroundColor, przekazane z kontrolera.
//W akcji sprawdzaj aktualną godzinę i jeśli jest między 8:00 a 20:00 podmieniał tekst color i backgroundColor odpowiednio na black i white.
//Gdy godzina wypada między 20:00 a 8:00, podmień wartości właściwości odwrotnie.
//Uruchom stronę i zobacz efekt. Tekst powinien być czarny, a strona biała.
//Zmodyfikuj program tak, aby nie brał pod uwagę aktualnej godziny, tylko na sztywno wpisz godzinę 1:00 w nocy.
//Wyświetl stronę i zobacz efekt. Tekst powinien być biały, a strona czarna.

@Controller
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/home")
    public String homeJsp(Model m) {
        String backgroundColor = "white";
        String fontColor = "black";

        final int currentHour = LocalTime.now().getHour();

        if(currentHour < 8 || currentHour > 20){
            backgroundColor = "black";
            fontColor = "white";
        }

        m.addAttribute("backgroundColor", backgroundColor);
        m.addAttribute("fontColor", fontColor);

        return "home";
    }
}
