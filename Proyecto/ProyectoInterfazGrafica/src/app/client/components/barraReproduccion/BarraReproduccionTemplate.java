package app.client.components.barraReproduccion;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class BarraReproduccionTemplate extends JPanel{

    private BarraReproduccionComponent barraReproduccionComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lArtista, lAlbum, lTetaneitor;
    private JButton bPlay, bDerecha, bIzquierda, bNiveles, bLista, bRepetir, bMute, bVolumen;
    private ImageIcon iDerecha, iIzquierda, iPlay, iTetaneitor, iDimAux,
            iNiveles, iLista, iRepetir, iMute, iVolumen;
    private Font fontAlbum, fontArtista;
    
    public BarraReproduccionTemplate(BarraReproduccionComponent barraReproduccionComponent){

        this.barraReproduccionComponent = barraReproduccionComponent;
        this.sObjGraficos= ObjGraficosService.getService();
        this.sRecursos = RecursosService.getService();
    
        this.crearObjetosDecoradores();
        this.crearJLabels();
        this.crearJButtons();
        
        this.setSize(910, 110);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public void crearObjetosDecoradores(){
        this.iPlay = new ImageIcon("resources/img/playBlanco.png");
        this.iDerecha = new ImageIcon("resources/img/derechaBlanco.png");
        this.iIzquierda = new ImageIcon("resources/img/izquierdaBlanco.png");
        this.iTetaneitor = new ImageIcon("resources/img/tetaneitor.jpg");
        this.iNiveles = new ImageIcon("resources/img/niveles.png");
        this.iLista = new ImageIcon("resources/img/lista.png");
        this.iRepetir = new ImageIcon("resources/img/repetir.png");
        this.iMute = new ImageIcon("resources/img/mute.png");
        this.iVolumen = new ImageIcon("resources/img/volumen.png");
        
        fontArtista = new Font("Berlin Sans FB", Font.PLAIN, 19);
        fontAlbum = new Font("Berlin Sans FB", Font.PLAIN, 13);
    }

    public void crearJButtons(){
        
        //BOTÓN IZQUIERDA--------------------------------------------------------------------
        iDimAux = new ImageIcon(iIzquierda.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING));
        bIzquierda = sObjGraficos.construirJButton(
                null, 280, (60/4)*3, 50, 50, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bIzquierda);
        
        //BOTÓN DERECHA--------------------------------------------------------------------
        iDimAux = new ImageIcon(iDerecha.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING));
        bDerecha = sObjGraficos.construirJButton(
                null, 380, (60/4)*3, 50, 50, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bDerecha);
        
        //BOTÓN PLAY--------------------------------------------------------------------
        iDimAux = new ImageIcon(iPlay.getImage().getScaledInstance(48, 48, Image.SCALE_AREA_AVERAGING));
        bPlay = sObjGraficos.construirJButton(
                null, 325, (50/4)*3+5, 60, 60, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bPlay);
        
        //BOTÓN LISTA--------------------------------------------------------------------
        iDimAux = new ImageIcon(iLista.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bLista = sObjGraficos.construirJButton(
                null, 525, (85/4)*3-5, 25, 25, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bLista);
        
        //BOTÓN REPETIR--------------------------------------------------------------------
        iDimAux = new ImageIcon(iRepetir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bRepetir = sObjGraficos.construirJButton(
                null, 565, (85/4)*3-5, 25, 25, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bRepetir);
        
        //BOTÓN NIVELES--------------------------------------------------------------------
        iDimAux = new ImageIcon(iNiveles.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bNiveles = sObjGraficos.construirJButton(
                null, 605, (85/4)*3-5, 25, 25, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bNiveles);
        
        //BOTÓN MUTE--------------------------------------------------------------------
        iDimAux = new ImageIcon(iMute.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bMute = sObjGraficos.construirJButton(
                null, 750, (85/4)*3-5, 25, 25, sRecursos.getcMano(), iDimAux, null, null, 
                null, null, "c", false
        );
        this.add(bMute);
    }
    
    public void crearJLabels(){
        
        // LABEL ARTISTA--------------------------------------------------------------------
        this.lArtista = sObjGraficos.construirJLabel(
            "Tetaneitor", 112, 85/2, 150, 25, null, sRecursos.getColorNav(), 
                null, fontArtista, "c"
        );
        lArtista.setHorizontalAlignment(SwingConstants.LEFT);
        this.add(lArtista);
        
        // LABEL ALBUM--------------------------------------------------------------------
        this.lAlbum = sObjGraficos.construirJLabel(
            "Los De Siempre", 114, 85/2+27, 150, 20, null, 
                sRecursos.getColorNav(), null, fontAlbum, "c"
        );
        lAlbum.setHorizontalAlignment(SwingConstants.LEFT);
        this.add(lAlbum);
        
        // LABEL IMAGEN TETANEITOR--------------------------------------------------------------------
        iDimAux = new ImageIcon(
            iTetaneitor.getImage().getScaledInstance(106, 106, Image.SCALE_AREA_AVERAGING)
        );
        this.lTetaneitor = sObjGraficos.construirJLabel(
            null, 2, 2, 106, 106, iDimAux, null, null, null, "c"
        );
        this.add(lTetaneitor);
    }
}
