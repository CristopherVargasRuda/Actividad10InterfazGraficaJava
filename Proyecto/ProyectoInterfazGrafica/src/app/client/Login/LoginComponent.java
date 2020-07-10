package app.client.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.client.VistaPrincipal.VistaPrincipalComponent;
import app.services.UsuarioService;
import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class LoginComponent implements ActionListener, FocusListener {

    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    private UsuarioService sUsuario;

    public LoginComponent() {
        sUsuario = UsuarioService.getService();
        this.loginTemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginTemplate.getbMinimizar()) {
            this.loginTemplate.setExtendedState(Frame.ICONIFIED);
        }
        if (e.getSource() == loginTemplate.getbRegistrarse()) {
            JOptionPane.showMessageDialog(null, "Boton Registro", "Advertencia", 1);
        }
        if (e.getSource() == loginTemplate.getbCerrar()) {
            System.exit(0);
        }
        if (e.getSource() == loginTemplate.getbEntrar()) {
            this.enviarDatosUsuario();
        }
    }

    public void enviarDatosUsuario() {
        String nombreUsuario = loginTemplate.gettNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.gettClaveUsuario().getPassword());
        if (sUsuario.verificarDatosUsuario(nombreUsuario, claveUsuario)) {
            JOptionPane.showMessageDialog(null, "Ingreso Exitoso", "Advertencia", 1);
            entrar();
        } else {
            JOptionPane.showMessageDialog(null, "Algo salió  mal", "Advertencia", 2);
        }
    }

    public void entrar() {
        if (vistaPrincipal == null) {
            this.vistaPrincipal = new VistaPrincipalComponent(this);
        } else {
            this.vistaPrincipal.getVistaPrincipalTemplate().setVisible(true);
        }
        loginTemplate.setVisible(false);
    }

    public LoginTemplate getLoginTemplate() {
        return this.loginTemplate;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == loginTemplate.gettClaveUsuario()) {
            if (new String(loginTemplate.gettClaveUsuario().getPassword()).equals("Clave Usuario")) {
                loginTemplate.gettClaveUsuario().setText("");
                loginTemplate.gettClaveUsuario().setBorder(loginTemplate.getsRecursos().getBordeVerde());
            }
        }
        if (e.getSource() == loginTemplate.gettNombreUsuario()) {
            if (loginTemplate.gettNombreUsuario().getText().equals("Dirección de correo o Nombre de usuario")) {
                loginTemplate.gettNombreUsuario().setText("");
                loginTemplate.gettNombreUsuario().setBorder(loginTemplate.getsRecursos().getBordeVerde());
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
         if (e.getSource() == loginTemplate.gettClaveUsuario()) {
            if (new String(loginTemplate.gettClaveUsuario().getPassword()).equals("")) {
                loginTemplate.gettClaveUsuario().setText("Clave Usuario");
                loginTemplate.gettClaveUsuario().setBorder(null);
            }
        }
        if (e.getSource() == loginTemplate.gettNombreUsuario()) {
            if (loginTemplate.gettNombreUsuario().getText().equals("")) {
                loginTemplate.gettNombreUsuario().setText("Dirección de correo o Nombre de usuario");
                loginTemplate.gettNombreUsuario().setBorder(null);
            }
        }
    }

}
