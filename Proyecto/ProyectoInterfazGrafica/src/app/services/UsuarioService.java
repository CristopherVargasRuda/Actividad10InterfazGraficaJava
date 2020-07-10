package app.services;

import logic.ControlUsuarios;

public class UsuarioService {

    private static UsuarioService servicio;
    private ControlUsuarios cUsuario;
    private String usuarioLogeado;

    public UsuarioService() {
        cUsuario = new ControlUsuarios();
    }

    public static UsuarioService getService() {
        if (servicio == null) {
            servicio = new UsuarioService();
        }
        return servicio;
    }

    public boolean verificarDatosUsuario(String nombreUsuario, String claveUsuario) {
        if (cUsuario.verificarUsuario(nombreUsuario, claveUsuario)) {
            this.usuarioLogeado = nombreUsuario;
            return true;
        }
        return false;
    }
}
