package app.client.components.radio;

import java.awt.Color;
import javax.swing.JPanel;


public class RadioTemplate extends JPanel{
    private RadioComponent radioComponent;
    
    public RadioTemplate(RadioComponent radioComponent){
        this.radioComponent = radioComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
