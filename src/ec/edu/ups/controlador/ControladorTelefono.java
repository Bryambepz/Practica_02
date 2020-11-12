/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author braya
 */
public class ControladorTelefono extends ControladorAbstract<Telefono> {

    private Usuario usuario;

    public ControladorTelefono() {
        super();
    }

    public int obtenerCodigo() {
        if (getListaObjetos().size() > 0)return getListaObjetos().size() + 1;return 1;
    }
    
    public Telefono comprobar(int id){
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var telf = getListaObjetos().get(i);
            if (id == telf.getCodigo()) {
                return telf;
            }
        }
        return null;
    }

    @Override
    public Telefono read(Telefono buscar) {
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var us = getListaObjetos().get(i);
            if (buscar.equals(us)) {
                return us;
            }
        }
        return null;
    }
}
