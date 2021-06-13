package pl.coderslab.jeespringmvconljeew03.controller.params.zad1zad2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

// Utwórz akcję dostępną pod pod adresem /random/<max> gdzie max będzie górną granicą zbioru z którego zostanie wylosowana liczba.
//Wylosuj wartość od 1 do max.
//Wyświetl w przeglądarce dane w następujący sposób: Użytkownik podał wartość . Wylosowano liczbę: .

@Controller
public class RandomController {
    @GetMapping("/random/{max}")
    @ResponseBody
    public String random(@PathVariable int max) {
        final int result = new Random(System.currentTimeMillis()).nextInt(max) + 1;
        return String.format("Użytkownik podał wartość %s. Wylosowano liczbę: %s", max, result);
    }


    // Zmodyfikuj poprzednią akcję tak, aby przyjmowała dodatkowo wartość minimalną <min>.
    //Wylosuj wartość od min do max.
    //Wyświetl w przeglądarce dane w następujący sposób: Użytkownik podał wartości <min> i <max>. Wylosowano liczbę: <wylosowana liczba>.
    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min, @PathVariable int max) {
        final int result = new Random(System.currentTimeMillis()).nextInt(max-min+1) + min;
        return String.format("Użytkownik podał wartości %s i %s. Wylosowano liczbę: %s", min, max, result);
    }
}
