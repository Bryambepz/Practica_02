/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author braya
 */
public class ControladorUsuario extends ControladorAbstract<Usuario> {

    public ControladorUsuario() {
        super();
    }

    Usuario sesionIniciada;

    public Usuario getSesionIniciada() {
        return sesionIniciada;
    }

    public boolean login(String email, String password) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            Usuario us = getListaObjetos().get(i);
            if (email.equals(us.getCorreo()) && password.equals(us.getContraseña())) {
                sesionIniciada = us;
                return true;
            }
        }
        return false;
    }

    public boolean comprobarCorreo(String email) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var correo = getListaObjetos().get(i);
            if (email.equals(correo.getCorreo())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Usuario read(Usuario buscar) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var us = getListaObjetos().get(i);
            if (buscar.equals(us)) {
                return us;
            }
        }
        return null;
    }

    public Usuario read(String correo) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var us = getListaObjetos().get(i);
            if (correo.equals(us.getCorreo())) {
                return us;
            }
        }
        return null;
    }

    public Usuario readCorreo(String correo) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var usuario = getListaObjetos().get(i);
            if (correo.equals(usuario.getCorreo())) {
                return usuario;
            }
        }
        return null;
    }
}
