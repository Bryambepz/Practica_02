/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import lombok.Data;

/**
 *
 * @author braya
 */
//@Data
public abstract class ControladorAbstract<T> {

    private List<T> listaObjetos;

    public ControladorAbstract() {
        listaObjetos = new ArrayList<>();
    }

    /**
     * Metodo Create para crear al objeto
     *
     * @param objeto
     * @return
     */
    public boolean create(T objeto) {
        if (!listaObjetos.contains(objeto)) {
            return listaObjetos.add(objeto);
        }
        return false;
//        return listaObjetos.add(objeto);
    }

    /**
     * Metodo read para buscar un objeto
     *
     * @param buscar
     * @return
     */
//    public abstract T read(T buscar);
    public T read(T buscar) {
        if (listaObjetos.contains(buscar)) {
            return listaObjetos.stream().filter(objeto -> objeto.equals(buscar)).findFirst().get();
        }
        return null;
    }

    /**
     * Metodo update para buscar si existe un objeto
     * @param usuario 
     */
    public void update(T usuario) {
        if (listaObjetos.contains(usuario)) {
            for (int i = 0; i < listaObjetos.size(); i++) {
                var us = listaObjetos.get(i);
                if (us.equals(usuario)) {
                    listaObjetos.set(i, usuario);
                    break;
                }
            }
        }else{
            System.out.println("No existe");
        }
    }

    /**
     * Metodo delete para eliminar un objeto creado
     *
     * @param objeto
     * @return
     */
    public boolean delete(T objeto) {
        T eliminarObjeto = read(objeto);
        return (eliminarObjeto != null) ? listaObjetos.remove(eliminarObjeto) : false;
    }

    public List<T> findAll() {
        return listaObjetos;
    }

    public List<T> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

}
