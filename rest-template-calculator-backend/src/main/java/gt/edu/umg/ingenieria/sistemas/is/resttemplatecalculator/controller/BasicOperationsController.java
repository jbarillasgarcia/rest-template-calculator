package gt.edu.umg.ingenieria.sistemas.is.resttemplatecalculator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basica")
public class BasicOperationsController {
    
    private Logger logger = LoggerFactory.getLogger(BasicOperationsController.class);

    @GetMapping("/sumar")
    public int sumar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        logger.info(String.format("@%s::sumar(%d, %d)", this.getClass().getName(), a, b));
        return a + b;
    }
    
    @GetMapping("/restar")    
    public int restar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        logger.info(String.format("@%s::restar(%d, %d)", this.getClass().getName(), a, b));
        return a - b;
    }
    
    @GetMapping("/multiplicar")    
    public int multiplicar(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        logger.info(String.format("@%s::mulitplicar(%d, %d)", this.getClass().getName(), a, b));
        return a * b;
    }
    
    @GetMapping("/dividir")    
    public int dividir(@RequestParam(required = true) int a, @RequestParam(required = true) int b) {
        logger.info(String.format("@%s::dividir(%d, %d)", this.getClass().getName(), a, b));
        return a / b;
    }
    
}
