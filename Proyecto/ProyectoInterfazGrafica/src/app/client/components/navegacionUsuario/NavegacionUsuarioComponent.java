package app.client.components.navegacionUsuario;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import app.services.RecursosService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class NavegacionUsuarioComponent implements ActionListener, MouseListener,
        MouseMotionListener {

    private NavegacionUsuarioTemplate navegacionUsuarioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private String comando;
    private int posicionInicialX, posicionInicialY;

    public NavegacionUsuarioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.navegacionUsuarioTemplate = new NavegacionUsuarioTemplate(this);
        comando = "";
    }

    public NavegacionUsuarioTemplate getNavegacionUsuarioTemplate() {
        return this.navegacionUsuarioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == navegacionUsuarioTemplate.getbCerrar()) {
            System.exit(0);
        }
        if (e.getSource() == navegacionUsuarioTemplate.getbMinimizar()) {
            vistaPrincipalComponent.minimizar();
        }
        if (!comando.equals(e.getActionCommand().trim())) {
            comando = e.getActionCommand().trim();
            this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim());
        } else {
            comando = "";
            this.vistaPrincipalComponent.mostrarComponente("principal");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        posicionInicialX = e.getX();
        posicionInicialY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = ((JButton) e.getSource());
            boton.setContentAreaFilled(true);
            boton.setBackground(RecursosService.getService().getColorInteraccion());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = ((JButton) e.getSource());
            boton.setContentAreaFilled(false);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.vistaPrincipalComponent.moverVentana(
                e.getXOnScreen() - posicionInicialX, e.getYOnScreen() - posicionInicialY
        );
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
