package app.client.Login;

import app.services.ObjGraficosService;
import app.services.RecursosService;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginTemplate extends JFrame {

    private ObjGraficosService sObjGraficos;//Objeto de la clase Service
    private RecursosService sRecursos;

    private JPanel pInferior, pSuperior;
    private JLabel lEslogan, lTituloLogin, lNotificaciones, lRegistro, lCondiciones, lCondiciones2;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bMaximizar, bMinimizar;
    private JCheckBox checkRecuerdame;
    private ImageIcon iLogo, iUsuario, iClave, iFacebook, iTwitter, iYoutube, iDimAux;
    private JLabel lLogo, lUsuario, lClave, lFacebook, lTwitter, lYoutube;

    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent loginComponent) {

        this.loginComponent = loginComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJTextFields();
        this.crearJPasswordFields();
        this.crearJButtons();
        this.crearJCheckBoxes();
        this.crearJLabels();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 650);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    private void crearObjetosDecoradores() {

        iLogo = new ImageIcon("resources/img/logo.png");
        iUsuario = new ImageIcon("resources/img/usuario.png");
        iClave = new ImageIcon("resources/img/clave.png");
        iFacebook = new ImageIcon("resources/img/facebook.png");
        iTwitter = new ImageIcon("resources/img/twitter.png");
        iYoutube = new ImageIcon("resources/img/youtube.png");
    }

    private void crearJPanels() {

        pSuperior = sObjGraficos.construirJPanel(
                0, 0, 1200, 140, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pSuperior);

        pInferior = sObjGraficos.construirJPanel(
                0, 140, 1200, 510, sRecursos.getColorFondo(),
                sRecursos.getBordeGris()
        );
        this.add(pInferior);
    }

    private void crearJTextFields() {

        tNombreUsuario = sObjGraficos.construirJTextField(
                "Dirección de correo o Nombre de usuario",
                (pInferior.getWidth() - 420) / 2, 125, 420, 40, sRecursos.getColorGris(),
                Color.WHITE, sRecursos.getColorSpotify(), sRecursos.getFontPanel(),
                null, "c"
        );
        tNombreUsuario.addFocusListener(loginComponent);
        pInferior.add(tNombreUsuario);
    }

    private void crearJPasswordFields() {

        tClaveUsuario = sObjGraficos.construirJPasswordField("Clave Usuario",
                (pInferior.getWidth() - 420) / 2, 180, 420, 40, sRecursos.getColorGris(),
                Color.WHITE, sRecursos.getColorSpotify(),
                sRecursos.getFontPanel(), null, "c"
        );
        tClaveUsuario.addFocusListener(loginComponent);
        pInferior.add(tClaveUsuario);
    }

    private void crearJButtons() {

        //Botón Entrar
        bEntrar = sObjGraficos.construirJButton(
                "INICIAR SESIÓN", (pInferior.getWidth() - 250) / 2, 240, 250, 45,
                sRecursos.getcMano(), null, sRecursos.getFontBoton(),
                sRecursos.getColorSpotify(), Color.white, null,
                "C", true
        );
        bEntrar.addActionListener(loginComponent);
        pInferior.add(bEntrar);

        //Botón Regristrarse
        bRegistrarse = sObjGraficos.construirJButton(
                "REGISTRATE", (pInferior.getWidth() - 220) / 2, 420, 220, 45,
                sRecursos.getcMano(), null, sRecursos.getFontBoton(),
                sRecursos.getColorSpotify(), Color.white, null,
                "c", true
        );
        bRegistrarse.addActionListener(loginComponent);
        pInferior.add(bRegistrarse);

        //Botón Cerrar
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null, 8, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        bCerrar.addActionListener(loginComponent);
        pSuperior.add(bCerrar);

        //Botón Maximizar
        iDimAux = new ImageIcon(sRecursos.getiMaximizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMaximizar = sObjGraficos.construirJButton(
                null, 26, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        pSuperior.add(bMaximizar);

        //Botón Minimizar
        iDimAux = new ImageIcon(sRecursos.getiMinimizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMinimizar = sObjGraficos.construirJButton(
                null, 44, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        this.bMinimizar.addActionListener(loginComponent);
        pSuperior.add(bMinimizar);
    }

    private void crearJCheckBoxes() {

        checkRecuerdame = sObjGraficos.construirJCheckBox(
                "Recuérdame", (pInferior.getWidth() - 200) / 2 + 44, 290, 200, 25,
                sRecursos.getcMano(), sRecursos.getFontSubtitulo(),
                sRecursos.getColorSpotify()
        );
        pInferior.add(checkRecuerdame);
    }

    private void crearJLabels() {

        lEslogan = sObjGraficos.construirJLabel(
                "Música Para Todos", (pInferior.getWidth() - 320) / 2, 20, 320, 35,
                null, Color.WHITE, null, sRecursos.getFontTPrincipal(), "c"
        );
        pInferior.add(lEslogan);

        lTituloLogin = sObjGraficos.construirJLabel(
                "Para continuar, inicia sesión en Spotify",
                (pInferior.getWidth() - 400) / 2, 75, 400, 30, null,
                Color.WHITE, null, sRecursos.getFontTitulo(), "c"
        );
        pInferior.add(lTituloLogin);

        lNotificaciones = sObjGraficos.construirJLabel(
                "¿Has olvidado tu contraseña?", (pInferior.getWidth() - 350) / 2,
                325, 350, 43, null, sRecursos.getColorSpotify(), null,
                sRecursos.getFontSubtitulo(), "c"
        );
        lNotificaciones.setBorder(sRecursos.getBordeGris());
        pInferior.add(lNotificaciones);

        lRegistro = sObjGraficos.construirJLabel(
                "¿No tienes cuenta?", (pInferior.getWidth() - 250) / 2, 365, 250,
                40, null, Color.white, null, sRecursos.getFontNotificacion(),
                "c"
        );
        pInferior.add(lRegistro);

        lCondiciones = sObjGraficos.construirJLabel(
                "<html><div align='center'>\"Si haces clic en iniciar sesión "
                + "con Facebook y no eres usuario de Spotify, pasarás "
                + "a estar <br>registrado y aceptas los Términos y "
                + "Condiciones y la Política de Privacidad de Spotify."
                + "</div></html>", (pInferior.getWidth() - 400) / 2,
                468, 400, 40, null, Color.WHITE, null, sRecursos.getFontCondiciones(),
                "c"
        );
        pInferior.add(lCondiciones);

        iDimAux = new ImageIcon(iLogo.getImage().getScaledInstance(250, 95, Image.SCALE_AREA_AVERAGING));
        lLogo = sObjGraficos.construirJLabel(
                null, (pSuperior.getWidth() - 250) / 2, 22, 250, 95, iDimAux, null,
                null, null, "c"
        );
        pSuperior.add(lLogo);

        iDimAux = new ImageIcon(iFacebook.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lFacebook = sObjGraficos.construirJLabel(
                null, 12, 470, 30, 30, iDimAux, null, null, null, "c"
        );
        pInferior.add(lFacebook);

        iDimAux = new ImageIcon(iTwitter.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lTwitter = sObjGraficos.construirJLabel(
                null, 52, 470, 30, 30, iDimAux, null, null, null, "c"
        );
        pInferior.add(lTwitter);

        iDimAux = new ImageIcon(iYoutube.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lYoutube = sObjGraficos.construirJLabel(
                null, 92, 470, 30, 30, iDimAux, null, null, null, "c"
        );
        pInferior.add(lYoutube);

        iDimAux = new ImageIcon(iUsuario.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lUsuario = sObjGraficos.construirJLabel(
                null, 355, 130, 30, 30, iDimAux, null, null, null, "c"
        );
        pInferior.add(lUsuario);

        iDimAux = new ImageIcon(iClave.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lClave = sObjGraficos.construirJLabel(
                null, 355, 185, 30, 30, iDimAux, null, null, null, "c"
        );
        pInferior.add(lClave);
    }

    public JTextField gettNombreUsuario() {
        return tNombreUsuario;
    }

    public JPasswordField gettClaveUsuario() {
        return tClaveUsuario;
    }

    public JButton getbEntrar() {
        return bEntrar;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbRegistrarse() {
        return bRegistrarse;
    }

    public JButton getbMaximizar() {
        return bMaximizar;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }

    public JCheckBox getCheckRecuerdame() {
        return checkRecuerdame;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
    
}
