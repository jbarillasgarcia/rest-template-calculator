package gt.edu.umg.ingenieria.sistemas.is.rest.template.calculator.core.model;

import java.util.Date;

public class MemoryItem {

    private int value;
    private Date lastModified;

    public MemoryItem() {
    }    

    public MemoryItem(int value) {
        this.value = value;
    }

    public MemoryItem(int value, Date lastModified) {
        this.value = value;
        this.lastModified = lastModified;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    
}
