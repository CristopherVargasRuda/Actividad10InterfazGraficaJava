package app.client.components.browse;

import java.awt.Color;
import javax.swing.JPanel;


public class BrowseTemplate extends JPanel{
    private BrowseComponent browseComponent;
    
    public BrowseTemplate(BrowseComponent browseComponent){
        this.browseComponent = browseComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.cyan);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
