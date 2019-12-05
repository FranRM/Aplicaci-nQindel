/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author Femio
 */
public class Ciudad implements Serializable{
    private int id_ciudad,valor_ciudad;
    private Pais id_pais;
    private String nombre_ciudad;

    public Ciudad() {
    }

    public Ciudad(int id_ciudad, int valor_ciudad, Pais id_pais, String nombre_ciudad) {
        this.id_ciudad = id_ciudad;
        this.valor_ciudad = valor_ciudad;
        this.id_pais = id_pais;
        this.nombre_ciudad = nombre_ciudad;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getValor_ciudad() {
        return valor_ciudad;
    }

    public void setValor_ciudad(int valor_ciudad) {
        this.valor_ciudad = valor_ciudad;
    }

    public Pais getId_pais() {
        return id_pais;
    }

    public void setId_pais(Pais id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
}
