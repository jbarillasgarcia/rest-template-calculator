package gt.edu.umg.ingenieria.sistemas.is.resttemplatecalculator.controller;

import gt.edu.umg.ingenieria.sistemas.is.rest.template.calculator.core.model.MemoryItem;
import java.util.Calendar;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memoria")
public class MemoryController {

    private MemoryItem m1;
    
    @GetMapping("/m1")
    public MemoryItem obtenerM1() {
        return this.m1;
    }
    
    @PostMapping("/m1")
    public MemoryItem guardarM1(@RequestBody(required = true) MemoryItem m1) {
        m1.setLastModified(Calendar.getInstance().getTime());
        
        this.m1 = m1;
        
        return this.m1;
    }
    
    @PutMapping("/m1")
    public MemoryItem actualizarM1(@RequestBody(required = true) MemoryItem m1) {
        this.m1.setValue(m1.getValue());
        
        this.m1.setLastModified(Calendar.getInstance().getTime());
        
        return this.m1;
    }
    
    @DeleteMapping("/m1")
    public void eliminarM1() {
        this.m1 = null;
    }
}
