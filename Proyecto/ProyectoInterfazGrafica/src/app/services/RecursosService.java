package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorFondo, colorFondo2, colorSpotify, colorGris, colorNav,
            colorInteraccion;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontBoton,
            fontNotificacion, fontPanel, fontCondiciones, fontNavegacion;
    private Cursor cMano;
    private ImageIcon iCerrar, iMaximizar, iMinimizar;
    private Border bordeVerde, bordeGris;

    static private RecursosService servicio;

    private RecursosService() {

        iCerrar = new ImageIcon("resources/img/botonRojo.png");
        iMaximizar = new ImageIcon("resources/img/botonAmarillo.png");
        iMinimizar = new ImageIcon("resources/img/botonVerde.png");

        colorFondo = new Color(17, 17, 23);
        colorFondo2 = new Color(15, 14, 15);
        colorSpotify = new Color(0, 189, 89);
        colorGris = new Color(32, 33, 39);
        colorNav = new Color(187, 187, 187);
        colorInteraccion = new Color(27, 27, 37);
        
        fontTPrincipal = new Font("Arial Rounded MT Bold", Font.PLAIN, 32);
        fontTitulo = new Font("Arial Rounded MT Bold", Font.PLAIN, 16);
        fontSubtitulo = new Font("book antiqua", Font.PLAIN, 15);
        fontNotificacion = new Font("book antiqua", Font.PLAIN, 17);
        fontBoton = new Font("arial black", Font.PLAIN, 15);
        fontPanel = new Font("Times New Roman", Font.PLAIN, 17);
        fontCondiciones = new Font("Times New Roman black", Font.PLAIN, 9);
        fontNavegacion = new Font("Berlin Sans FB", Font.PLAIN, 15);

        cMano = new Cursor(Cursor.HAND_CURSOR);

        bordeVerde = BorderFactory.createMatteBorder(0, 0, 2, 0, colorSpotify);
        bordeGris = BorderFactory.createMatteBorder(0, 0, 1, 0, colorGris);
    }

    public static RecursosService getService() {
        if (servicio == null) {
            servicio = new RecursosService();
        }
        return servicio;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorFondo2() {
        return colorFondo2;
    }

    public Color getColorNav() {
        return colorNav;
    }

    public Color getColorSpotify() {
        return colorSpotify;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Color getColorInteraccion() {
        return colorInteraccion;
    }
    
    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Font getFontBoton() {
        return fontBoton;
    }

    public Font getFontNotificacion() {
        return fontNotificacion;
    }

    public Font getFontPanel() {
        return fontPanel;
    }

    public Font getFontCondiciones() {
        return fontCondiciones;
    }

    public Font getFontNavegacion() {
        return fontNavegacion;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public ImageIcon getiCerrar() {
        return iCerrar;
    }

    public ImageIcon getiMaximizar() {
        return iMaximizar;
    }

    public ImageIcon getiMinimizar() {
        return iMinimizar;
    }

    public Border getBordeVerde() {
        return bordeVerde;
    }

    public Border getBordeGris() {
        return bordeGris;
    }

    public static RecursosService getServicio() {
        return servicio;
    }

}
