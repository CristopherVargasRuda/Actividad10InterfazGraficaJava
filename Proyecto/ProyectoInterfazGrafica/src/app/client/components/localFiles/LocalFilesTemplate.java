package app.client.components.localFiles;

import java.awt.Color;
import javax.swing.JPanel;


public class LocalFilesTemplate extends JPanel{
    private LocalFilesComponent localFilesComponent;
    
    public LocalFilesTemplate(LocalFilesComponent localFilesComponent){
        this.localFilesComponent = localFilesComponent;
        
        this.setSize(910, 540);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
