package app.client.components.barraReproduccion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BarraReproduccionComponent implements ActionListener{

    private BarraReproduccionTemplate barraReproduccionTemplate;

    
    public BarraReproduccionComponent() {
        this.barraReproduccionTemplate = new BarraReproduccionTemplate(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.exit(0);
    }

    public BarraReproduccionTemplate getBarraReproduccionTemplate() {
        return this.barraReproduccionTemplate;
    }
    
    

}
