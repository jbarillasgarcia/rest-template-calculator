package gt.edu.umg.ingenieria.sistemas.is.rest.template.calculator.frontend;

import gt.edu.umg.ingenieria.sistemas.is.rest.template.calculator.core.model.MemoryItem;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class Calculator {
    
    public static final String ADD_ENDPOINT = "http://localhost:8085/basica/sumar";
    public static final String SUB_ENDPOINT = "http://localhost:8085/basica/restar";
    public static final String MUL_ENDPOINT = "http://localhost:8085/basica/multiplicar";
    public static final String DIV_ENDPOINT = "http://localhost:8085/basica/dividir";
    public static final String M1_ENDPOINT = "http://localhost:8085/memoria/m1";    

    public int doAdd(int a, int b) throws Exception {
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(ADD_ENDPOINT)
                .queryParam("a", a)
                .queryParam("b", b);
        
        RestTemplate addRestTemplate = new RestTemplate();
        
        String response = addRestTemplate.getForObject(builder.toUriString(), String.class);
        
        return Integer.parseInt(response);
    }
    
    public int doSub(int a, int b) throws Exception {
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(ADD_ENDPOINT)
                .queryParam("a", a)
                .queryParam("b", b);
        
        RestTemplate subRestTemplate = new RestTemplate();
        ResponseEntity<Integer> response = subRestTemplate.getForEntity(builder.toUriString(), Integer.class);
        
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody();
        } else {
            throw new Exception(String.format("Error No. %d", response.getStatusCodeValue()));
        }
    }
    
    public int doMul(int a, int b) throws Exception {
        throw new Exception("Not yet implemented.");
    }
    
    public int doDiv(int a, int b) throws Exception {
        throw new Exception("Not yet implemented.");
    }
    
    public int doSaveMemory(int a) {
        MemoryItem entity = new MemoryItem(a);
        
        RestTemplate restTemplate = new RestTemplate();
        
        MemoryItem savedEntity = restTemplate.postForObject(M1_ENDPOINT, entity, MemoryItem.class);
        
        return (savedEntity != null) ? savedEntity.getValue() : 0;
    }
    
    public void doUpdateMemory(int a) {
        MemoryItem entity = new MemoryItem(a);
        
        RestTemplate restTemplate = new RestTemplate();
        
        restTemplate.put(M1_ENDPOINT, entity);
    }
}
