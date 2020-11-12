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
//        return 123456789;
        if (getListaObjetos().size() > 0)return getListaObjetos().size() + 1;return 1;
    }

}
