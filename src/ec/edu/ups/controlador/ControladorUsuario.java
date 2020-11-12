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
    
    public boolean login(String email, String password) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            Usuario us = getListaObjetos().get(i);
            if (email.equals(us.getCorreo()) && password.equals(us.getContraseña()))return true;
        }
        return false;
    }

    public Usuario buscarNombre(Usuario usuario) {
        return getListaObjetos().stream().filter(bN -> bN.getCedula().equals(usuario.getCedula())).findFirst().get();
    }

    public Usuario buscarTelefono(Telefono telefono) {
        return getListaObjetos().stream().filter(bn -> bn.buscarTelefono(telefono).equals(telefono.getNumero())).findFirst().get();
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
}
