package app.client.components.accion;

import javax.swing.ImageIcon;


public class AccionComponent {
    
    private AccionTemplate accionTemplate;

    public AccionComponent(
            int nColor, String titulo, int numero, String artista, 
            String tiempo, String direccion
    ) {
        this.accionTemplate = new AccionTemplate(
                this, nColor, titulo, numero, artista, tiempo, direccion
        );
    }
    
    public AccionTemplate getAccionTemplate() {
        return accionTemplate;
    }
}
