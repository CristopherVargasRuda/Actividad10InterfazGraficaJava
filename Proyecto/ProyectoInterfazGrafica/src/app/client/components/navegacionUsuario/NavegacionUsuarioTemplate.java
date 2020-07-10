package app.client.components.navegacionUsuario;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NavegacionUsuarioTemplate extends JPanel {

    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pSuperior, pInferior, pMedio;
    private JTextField tBuscar;
    private JLabel lSpotify, lMain, lYourMusic;
    private JButton bArtists, bBrowse, bSongs, bActivity, bRadio, bAlbums,
            bLocalFiles, bCerrar, bMaximizar, bMinimizar, bDerecha,
            bIzquierda;
    private ImageIcon iSpotify, iArtists, iSongs, iActivity, iRadio,
            iAlbums, iLocalFiles, iDerecha, iIzquierda, iBrowse, iDimAux;
    private Font fontAuxiliar;

    public NavegacionUsuarioTemplate(NavegacionUsuarioComponent navegacionUsuarioComponent) {
        this.navegacionUsuarioComponent = navegacionUsuarioComponent;
        this.sObjGraficos = ObjGraficosService.getService();
        this.sRecursos = RecursosService.getService();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJLabels();
        this.crearJTextFields();
        this.crearJButtons();
        this.setSize(290, 650);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradores() {
        this.iSpotify = new ImageIcon("resources/img/spotify.png");
        this.iBrowse = new ImageIcon("resources/img/browse.png");
        this.iArtists = new ImageIcon("resources/img/artists.png");
        this.iSongs = new ImageIcon("resources/img/songs.png");
        this.iActivity = new ImageIcon("resources/img/activity.png");
        this.iRadio = new ImageIcon("resources/img/radio.png");
        this.iAlbums = new ImageIcon("resources/img/albums.png");
        this.iLocalFiles = new ImageIcon("resources/img/localFiles.png");
        this.iDerecha = new ImageIcon("resources/img/derechaGris.png");
        this.iIzquierda = new ImageIcon("resources/img/izquierdaGris.png");

        fontAuxiliar = new Font("Berlin Sans FB", Font.PLAIN, 11);
    }

    public void crearJPanels() {

        this.pSuperior = sObjGraficos.construirJPanel(
                0, 0, 290, 140, sRecursos.getColorFondo(), null
        );
        this.add(pSuperior);
        pSuperior.addMouseListener(navegacionUsuarioComponent);
        pSuperior.addMouseMotionListener(navegacionUsuarioComponent);

        this.pMedio = sObjGraficos.construirJPanel(
                0, 140, 290, 165, sRecursos.getColorFondo(), null
        );
        this.add(pMedio);

        this.pInferior = sObjGraficos.construirJPanel(
                0, 305, 290, 345, sRecursos.getColorFondo(), null
        );
        this.add(pInferior);
    }

    public void crearJButtons() {

        //BOTÓN CERRAR--------------------------------------------------------------------
        iDimAux = new ImageIcon(sRecursos.getiCerrar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bCerrar = sObjGraficos.construirJButton(
                null, 8, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        this.bCerrar.addActionListener(navegacionUsuarioComponent);
        pSuperior.add(bCerrar);

        //BOTÓN MAXIMIZAR--------------------------------------------------------------------
        iDimAux = new ImageIcon(sRecursos.getiMaximizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMaximizar = sObjGraficos.construirJButton(
                null, 26, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        pSuperior.add(bMaximizar);

        //BOTÓN MINIMIZAR--------------------------------------------------------------------
        iDimAux = new ImageIcon(sRecursos.getiMinimizar().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        bMinimizar = sObjGraficos.construirJButton(
                null, 44, 7, 15, 15, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        this.bMinimizar.addActionListener(navegacionUsuarioComponent);
        pSuperior.add(bMinimizar);

        //BOTÓN IZQUIERDA--------------------------------------------------------------------
        iDimAux = new ImageIcon(iIzquierda.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        bIzquierda = sObjGraficos.construirJButton(
                null, 220, 7, 20, 20, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        pSuperior.add(bIzquierda);

        //BOTÓN DERECHA--------------------------------------------------------------------
        iDimAux = new ImageIcon(iDerecha.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        bDerecha = sObjGraficos.construirJButton(
                null, 240, 7, 20, 20, sRecursos.getcMano(), iDimAux, null, null,
                null, null, "c", false
        );
        pSuperior.add(bDerecha);

        // BOTÓN BROWSE--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iBrowse.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bBrowse = sObjGraficos.construirJButton(
                "      Browse", 25, 35, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bBrowse.addActionListener(navegacionUsuarioComponent);
        this.bBrowse.addMouseListener(navegacionUsuarioComponent);
        this.pMedio.add(bBrowse);

        // BOTÓN ACTIVITY--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iActivity.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bActivity = sObjGraficos.construirJButton(
                "      Activity", 25, 70, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bActivity.addActionListener(navegacionUsuarioComponent);
        this.bActivity.addMouseListener(navegacionUsuarioComponent);
        this.pMedio.add(bActivity);

        // BOTÓN RADIO--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iRadio.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bRadio = sObjGraficos.construirJButton(
                "      Radio", 25, 105, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bRadio.addActionListener(navegacionUsuarioComponent);
        this.bRadio.addMouseListener(navegacionUsuarioComponent);
        this.pMedio.add(bRadio);

        // BOTÓN SONGS--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iSongs.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bSongs = sObjGraficos.construirJButton(
                "      Songs", 25, 35, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bSongs.addActionListener(navegacionUsuarioComponent);
        this.bSongs.addMouseListener(navegacionUsuarioComponent);
        this.pInferior.add(bSongs);

        // BOTÓN ALBUMS--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iAlbums.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bAlbums = sObjGraficos.construirJButton(
                "      Albums", 25, 70, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bAlbums.addActionListener(navegacionUsuarioComponent);
        this.bAlbums.addMouseListener(navegacionUsuarioComponent);
        this.pInferior.add(bAlbums);

        // BOTÓN ARTISTS--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iArtists.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bArtists = sObjGraficos.construirJButton(
                "      Artists", 25, 105, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bArtists.addActionListener(navegacionUsuarioComponent);
        this.bArtists.addMouseListener(navegacionUsuarioComponent);
        this.pInferior.add(bArtists);

        // BOTÓN LOCAL FILES--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iLocalFiles.getImage().getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bLocalFiles = sObjGraficos.construirJButton(
                "      Local Files", 25, 140, 200, 40, sRecursos.getcMano(),
                iDimAux, sRecursos.getFontNavegacion(), null, sRecursos.getColorNav(), null, "l", false
        );
        this.bLocalFiles.addActionListener(navegacionUsuarioComponent);
        this.bLocalFiles.addMouseListener(navegacionUsuarioComponent);
        this.pInferior.add(bLocalFiles);
    }

    private void crearJTextFields() {
        tBuscar = sObjGraficos.construirJTextField(
                "Buscar", 55, (pSuperior.getHeight() - 25) / 2 + 15, 195, 25,
                sRecursos.getColorGris(), sRecursos.getColorNav(),
                sRecursos.getColorNav(), sRecursos.getFontNavegacion(), null, "c"
        );
        pSuperior.add(tBuscar);
    }

    public void crearJLabels() {

        // LABEL MAIN--------------------------------------------------------------------
        this.lMain = sObjGraficos.construirJLabel(
                "MAIN", 15, 5, 30, 20, null, sRecursos.getColorNav(), null,
                fontAuxiliar, "c"
        );
        this.pMedio.add(lMain);

        // LABEL YOUR MUSIC--------------------------------------------------------------------
        this.lYourMusic = sObjGraficos.construirJLabel(
                "YOUR MUSIC", 15, 5, 70, 20, null, sRecursos.getColorNav(), null,
                fontAuxiliar, "c"
        );
        this.pInferior.add(lYourMusic);

        // LABEL IMAGEN SPOTIFY--------------------------------------------------------------------
        iDimAux = new ImageIcon(
                iSpotify.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING)
        );
        this.lSpotify = sObjGraficos.construirJLabel(
                null, 18, (pSuperior.getHeight() - 45) / 2 + 15, 45, 45, iDimAux, null,
                null, null, "c"
        );
        this.pSuperior.add(lSpotify);
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbMaximizar() {
        return bMaximizar;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }
}
