package app.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Accion;

public class AccionService {

    private static AccionService servicio;
    private ArrayList<Accion> acciones;
    
    public AccionService() {
        acciones = new ArrayList<Accion>();
        cargarDatos();
    }
    
    public static AccionService getService() {
        if (servicio == null) {
            servicio = new AccionService();
        }
        return servicio;
    }

    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("src/archives/acciones.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split(",");
                Accion accion = new Accion();
                accion.setNombreCancion(atributos[0]);
                accion.setNombreBanda(atributos[1]);
                accion.setTiempoCancion(atributos[2]);
                accion.setDireccionImagen(atributos[3]);
                acciones.add(accion);
            }
            fr.close();
            System.out.println(acciones.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Accion devolverAccion(int posicion) {
        try {
            return acciones.get(posicion);
        } catch (Exception e) {
            return null;
        }
    }
}
