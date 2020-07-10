package app.client.components.activity;

import java.awt.Color;
import javax.swing.JPanel;


public class ActivityTemplate extends JPanel{
    private ActivityComponent activityComponent;
    
    public ActivityTemplate(ActivityComponent activityComponent){
        this.activityComponent = activityComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
