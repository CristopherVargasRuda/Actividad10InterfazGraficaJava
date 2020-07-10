package app.client.components.artists;

import java.awt.Color;
import javax.swing.JPanel;


public class ArtistsTemplate extends JPanel{
    private ArtistsComponent artistsComponent;
    
    public ArtistsTemplate(ArtistsComponent artistsComponent){
        this.artistsComponent = artistsComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.green);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
