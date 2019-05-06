package gt.edu.umg.ingenieria.sistemas.is.rest.template.calculator.frontend;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorApplication {
    
    private Calculator calculator = new Calculator();
    
    private JFrame frame; 
    private JTextField resultField;  
    private JTextField num1Field;
    private JTextField num2Field;
    
    public static void main(String[] args) {        
        CalculatorApplication calcApp = new CalculatorApplication();
        calcApp.initialize();
        calcApp.frame.setVisible(true);
    }
    
    public void initialize() {        
        this.frame = new JFrame("Calculadora");
        this.frame.setBounds(0, 0, 400, 300);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setLayout(null);
        
        // Add button
        JButton addButton = new JButton("+");
        addButton.setBounds(10, 10, 50, 50);        
        this.frame.getContentPane().add(addButton); 
        addButton.addActionListener((ActionEvent e) -> {            
            try {
                this.resultField.setText(String.format("%d", this.calculator.doAdd(
                        Integer.parseInt(this.num1Field.getText()),
                        Integer.parseInt(this.num2Field.getText())
                )));
            } catch (Exception ex) {
                Logger.getLogger(CalculatorApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        // Subs button
        JButton subButton = new JButton("-");
        subButton.setBounds(70, 10, 50, 50);        
        this.frame.getContentPane().add(subButton);
        subButton.addActionListener((ActionEvent e) -> {            
            try {
                this.resultField.setText(String.format("%d", this.calculator.doSub(
                        Integer.parseInt(this.num1Field.getText()),
                        Integer.parseInt(this.num2Field.getText())
                )));
            } catch (Exception ex) {
                Logger.getLogger(CalculatorApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        // Mul button
        JButton mulButton = new JButton("*");
        mulButton.setBounds(130, 10, 50, 50);        
        this.frame.getContentPane().add(mulButton);
        mulButton.addActionListener((ActionEvent e) -> {            
            try {
                this.resultField.setText(String.format("%d", this.calculator.doMul(
                        Integer.parseInt(this.num1Field.getText()),
                        Integer.parseInt(this.num2Field.getText())
                )));
            } catch (Exception ex) {
                Logger.getLogger(CalculatorApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        // Div button
        JButton divButton = new JButton("/");
        divButton.setBounds(190, 10, 50, 50);        
        this.frame.getContentPane().add(divButton);
        divButton.addActionListener((ActionEvent e) -> {            
            try {
                this.resultField.setText(String.format("%d", this.calculator.doDiv(
                        Integer.parseInt(this.num1Field.getText()),
                        Integer.parseInt(this.num2Field.getText())
                )));
            } catch (Exception ex) {
                Logger.getLogger(CalculatorApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
                
        // Num1 label
        JLabel aLabel = new JLabel("a =");
        aLabel.setBounds(10, 70, 30, 30);
        this.frame.getContentPane().add(aLabel);
        
        // Num2 label
        JLabel bLabel = new JLabel("b =");
        bLabel.setBounds(10, 110, 30, 30);
        this.frame.getContentPane().add(bLabel);
        
        // Result label
        JLabel resultLabel = new JLabel("r =");
        resultLabel.setBounds(10, 150, 30, 30);
        this.frame.getContentPane().add(resultLabel);
        
        // Num1 field
        num1Field = new JTextField();
        num1Field.setBounds(40, 70, 300, 30);
        this.frame.getContentPane().add(num1Field);        
        
        // Num2 field
        num2Field = new JTextField();
        num2Field.setBounds(40, 110, 300, 30);
        this.frame.getContentPane().add(num2Field);        
        
        // Result field
        resultField = new JTextField();
        resultField.setBounds(40, 150, 300, 30);
        this.frame.getContentPane().add(resultField);
    }
    
}
