/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

//import lombok.Data;

import java.util.Objects;


/**
 *
 * @author braya
 */
//@Data
public class Telefono {
    private int codigo;
    private String Numero;
    private String Tipo;
    private String Operadora;
//    private Usuario User;

    public Telefono(int codigo, String Numero, String Tipo, String Operadora) {
        this.codigo = codigo;
        this.Numero = Numero;
        this.Tipo = Tipo;
        this.Operadora = Operadora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
        hash = 83 * hash + Objects.hashCode(this.Numero);
        hash = 83 * hash + Objects.hashCode(this.Tipo);
        hash = 83 * hash + Objects.hashCode(this.Operadora);
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
        final Telefono other = (Telefono) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.Numero, other.Numero)) {
            return false;
        }
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        if (!Objects.equals(this.Operadora, other.Operadora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "codigo=" + codigo + ", Numero=" + Numero + ", Tipo=" + Tipo + ", Operadora=" + Operadora + '}';
    }
    
}
