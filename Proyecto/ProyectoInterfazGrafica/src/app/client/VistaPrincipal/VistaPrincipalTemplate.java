package app.client.VistaPrincipal;

import javax.swing.JFrame;
import app.services.RecursosService;
import app.services.ObjGraficosService;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class VistaPrincipalTemplate extends JFrame{
    
    private VistaPrincipalComponent vistaPrincipalComponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private JPanel pNavegacion, pBarra, pPrincipal;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearJPanels();
        setUndecorated(true);
        setSize(1200, 650);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
    
    public void crearJPanels(){
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 290, 650, null, null);
        this.add(pNavegacion);

        pBarra = sObjGraficos.construirJPanel(290, 540, 910, 110, Color.BLACK, null);
        this.add(pBarra);

        pPrincipal = sObjGraficos.construirJPanel(290, 0, 910, 540, null, null);
        this.add(pPrincipal);
    }
    
    public JPanel getpNavegacion() {
        return pNavegacion;
    }

    public JPanel getpBarra() {
        return pBarra;
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }
}
