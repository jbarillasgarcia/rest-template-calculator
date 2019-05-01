package gt.edu.umg.ingenieria.sistemas.is.resttemplatecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basica")
public class BasicOperations {

    @GetMapping("/sumar")    
    public int sumar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        return a + b;
    }
    
    @GetMapping("/restar")    
    public int restar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        return a - b;
    }
    
    @GetMapping("/multiplicar")    
    public int multiplicar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        return a * b;
    }
    
    @GetMapping("/dividir")    
    public int dividir(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        return a / b;
    }
    
}
