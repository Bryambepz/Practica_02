/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//import lombok.Data;

/**
 *
 * @author braya
 */
//@Data
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    //Agregacion
    private List<Telefono> listaTelefonos;

    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        listaTelefonos = new ArrayList<>();
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña, List<Telefono> listaTelefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.listaTelefonos = listaTelefonos;
    }

    public boolean agregarTelefono(Telefono telefono){
        return this.listaTelefonos.add(telefono);
    }
    
    public Telefono buscarTelefono(Telefono tel){
        return this.listaTelefonos.stream().filter(telf -> telf.getNumero().equals(tel.getNumero())).findFirst().get();
    }
    
    public int posicion(Telefono telefono){
        return this.listaTelefonos.stream().filter(bus -> bus.getCodigo() == telefono.getCodigo()).findFirst().hashCode();
//        for (int i = 0; i < getListaTelefonos().size(); i++) {
//            Telefono telf = listaTelefonos.get(i);
//            if (telf.getCodigo() == telefono.getCodigo()) {
//                return i;
//            }
//        }
//        return -1;
    }
    
    public boolean actualizarTelefono(Telefono telefono){
//        var pos = posicion(telefono);
        var pos = this.listaTelefonos.stream().filter(bus -> bus.getCodigo() == telefono.getCodigo()).findFirst().hashCode();
        if (pos > 0) {
            this.listaTelefonos.set(pos, telefono);
            return true;
        }
        return false;
//        Telefono obtenerTelefono = listaTelefonos.stream().filter(bTelf -> bTelf.getCodigo() == telefono.getCodigo()).findFirst().get();
//        listaTelefonos.set(0, telefono)
    }
    
    public boolean eliminarTelefono(Telefono telefono){
        Telefono eliminarTelefono = buscarTelefono(telefono);
        return (eliminarTelefono != null) ? this.listaTelefonos.remove(eliminarTelefono) : false;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Telefono> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List<Telefono> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", listaTelefonos=" + listaTelefonos + '}';
    }
    
    
}
