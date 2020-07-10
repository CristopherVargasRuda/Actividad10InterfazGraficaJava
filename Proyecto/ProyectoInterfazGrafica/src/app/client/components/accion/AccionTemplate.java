package app.client.components.accion;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AccionTemplate extends JPanel {

    private AccionComponent accionComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lTitulo, lPlay, lAlbum, lTiempo, lArtista;
    private ImageIcon iDimAux, iplay, imagen;
    private Color color;
    private Font fontTitulo, fontArtista;

    public AccionTemplate(
            AccionComponent accionComponent, int nColor, String titulo,
            int numero, String artista, String tiempo, String direccion
    ) {

        this.accionComponent = accionComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        if (nColor == 1) {
            color = sRecursos.getColorFondo();
        } else {
            color = sRecursos.getColorFondo2();
        }

        imagen = new ImageIcon(direccion);

        iplay = new ImageIcon("resources/img/playVerde.png");

        fontTitulo = new Font("Berlin Sans FB", Font.PLAIN, 15);
        fontArtista = new Font("Berlin Sans FB", Font.PLAIN, 13);

        //IMAGEN DEL ALBUM ----------------------------------------------------
        iDimAux = new ImageIcon(
                imagen.getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING)
        );
        this.lAlbum = sObjGraficos.construirJLabel(
                null, 10, 5, 45, 45, iDimAux, null, null, null, "c"
        );
        this.add(lAlbum);

        //IMAGEN DEL PLAY ----------------------------------------------------
        iDimAux = new ImageIcon(
                iplay.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        this.lPlay = sObjGraficos.construirJLabel(
                null, 90, (55 - 30) / 2, 30, 30, iDimAux, null, null, null, "c"
        );
        this.add(lPlay);

        //LABEL DEL CANCIÓN ----------------------------------------------------
        this.lTitulo = sObjGraficos.construirJLabel(
                numero + ".  " + titulo, 155, (55 - 15) / 2, 235, 15, null,
                Color.WHITE, null, fontTitulo, "l"
        );
        this.add(lTitulo);

        //LABEL DEL ARTISTA ----------------------------------------------------
        this.lArtista = sObjGraficos.construirJLabel(
                artista, 440, (55 - 13) / 2, 130, 13, null,
                sRecursos.getColorNav(), null, fontArtista, "l"
        );
        this.add(lArtista);

        //LABEL DEL TIEMPO ----------------------------------------------------
        this.lTiempo = sObjGraficos.construirJLabel(
                tiempo, 580, (55 - 13) / 2, 50, 13, null,
                sRecursos.getColorNav(), null, fontArtista, "l"
        );
        this.add(lTiempo);

        this.setSize(656, 55);
        this.setBackground(color);
        this.setLayout(null);
        this.setVisible(true);
    }

}
