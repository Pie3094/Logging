package com.example.Logging.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1")
public class loggingController {

    @Value("${Logging.env.variable1}")
    private int variable1;

    @Value("${Logging.env.variable2}")
    private int variable2;

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("Messaggio di benvenuto!.");
        return "Benvenuto nella mia prima app!";
    }

    @GetMapping("/esponente")
    public String calculatePower() {
        System.out.println("Inizio calcolo");
        double result = Math.pow(variable1, variable2);
        System.out.println("Calcolo riuscito: " + result);
        return " L'esponente è " + result;
    }

    @GetMapping("/get-errors")
    public String throwCustomError() throws Exception {
        System.out.println("Errore personale");
        throw new Exception("Errore inviato!");
    }


}
