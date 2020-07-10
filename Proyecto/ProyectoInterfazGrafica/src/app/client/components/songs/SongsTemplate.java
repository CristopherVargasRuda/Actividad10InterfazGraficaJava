package app.client.components.songs;

import java.awt.Color;
import javax.swing.JPanel;


public class SongsTemplate extends JPanel{
    private SongsComponent songsComponent;
    
    public SongsTemplate(SongsComponent songsComponent){
        this.songsComponent = songsComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.orange);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
