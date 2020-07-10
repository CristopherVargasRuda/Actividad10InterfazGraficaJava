package app.client.components.principal;

import app.client.components.accion.AccionComponent;
import app.client.components.accion.AccionTemplate;
import javax.swing.JPanel;
import app.services.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import models.Accion;

public class PrincipalTemplate extends JPanel {

    private PrincipalComponent principalComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pSuperior, pIzquierda, pDerecha;
    private ImageIcon iSuperior, iTetaneitor, iDimAux;
    private JLabel lSuperior, lTetaneitor;

    public PrincipalTemplate(PrincipalComponent principalComponent) {
        this.principalComponent = principalComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjetosDecoradores();
        crearJPanels();
        crearJLabels();
        crearContenidoPAcciones();

        this.setSize(910, 540);
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearObjetosDecoradores() {
        iSuperior = new ImageIcon("resources/img/superior.png");
        iTetaneitor = new ImageIcon("resources/img/tetaneitor.jpg");
    }

    private void crearJPanels() {
        pSuperior = sObjGraficos.construirJPanel(
                0, 0, 910, 230, sRecursos.getColorFondo2(), null
        );
        this.add(pSuperior);

        pIzquierda = sObjGraficos.construirJPanel(
                0, 230, 660, 310, sRecursos.getColorFondo2(), null
        );
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(
                660, 230, 270, 310, sRecursos.getColorFondo2(), null
        );
        this.add(pDerecha);
    }

    private void crearJLabels() {
        // LABEL IMAGEN ENCABEZADO ----------------------------------------------------
        iDimAux = new ImageIcon(iSuperior.getImage().getScaledInstance(910, 230, Image.SCALE_AREA_AVERAGING));
        lSuperior = sObjGraficos.construirJLabel(
                null, 0, 0, 910, 230, iDimAux, null, null, null, "c"
        );
        pSuperior.add(lSuperior);

        // LABEL IMAGEN TETANEITOR ----------------------------------------------------
        iDimAux = new ImageIcon(iTetaneitor.getImage().getScaledInstance(250, 200, Image.SCALE_AREA_AVERAGING));
        lTetaneitor = sObjGraficos.construirJLabel(
                null, 0, 55, 250, 200, iDimAux, null, null, null, "c"
        );
        lTetaneitor.setBorder(sRecursos.getBordeVerde());
        pDerecha.add(lTetaneitor);
    }

    public void crearContenidoPAcciones() {
        int numeroAccion = 0;
        Accion accion = principalComponent.obtenerAccion(numeroAccion);
        while (accion != null) {
            AccionTemplate pAccion = new AccionComponent(
                    numeroAccion % 2, accion.getNombreCancion(), numeroAccion + 1,
                    accion.getNombreBanda(), accion.getTiempoCancion(),
                    accion.getDireccionImagen()
            ).getAccionTemplate();
            pAccion.setLocation(2, numeroAccion * 55);
            this.pIzquierda.add(pAccion);
            numeroAccion++;
            accion = principalComponent.obtenerAccion(numeroAccion);
        }
    }
}
