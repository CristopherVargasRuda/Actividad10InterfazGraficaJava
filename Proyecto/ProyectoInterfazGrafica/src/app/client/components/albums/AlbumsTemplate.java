package app.client.components.albums;

import java.awt.Color;
import javax.swing.JPanel;


public class AlbumsTemplate extends JPanel{
    private AlbumsComponent albumsComponent;
    
    public AlbumsTemplate(AlbumsComponent albumsComponent){
        this.albumsComponent = albumsComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.magenta);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
