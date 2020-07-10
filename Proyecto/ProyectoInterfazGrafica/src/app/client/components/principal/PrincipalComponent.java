package app.client.components.principal;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import app.services.AccionService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.Accion;

public class PrincipalComponent implements ActionListener, MouseListener {

    private PrincipalTemplate principalTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private AccionService sAccion;

    public PrincipalComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        sAccion = AccionService.getService();
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.principalTemplate = new PrincipalTemplate(this);
    }

    public Accion obtenerAccion(int numeroAccion) {
        return sAccion.devolverAccion(numeroAccion);
    }
    
    public PrincipalTemplate getPrincipalTemplate() {
        return principalTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
