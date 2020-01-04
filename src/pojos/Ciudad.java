/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;

/**
 *
 * @author Femio
 */
public class Ciudad implements Serializable{
    private Integer id_ciudad,valor_ciudad;
    private Pais id_pais;
    private String nombre_ciudad;

    public Ciudad() {
    }

    public Ciudad(Integer id_ciudad, Integer valor_ciudad, Pais id_pais, String nombre_ciudad) {
        this.id_ciudad = id_ciudad;
        this.valor_ciudad = valor_ciudad;
        this.id_pais = id_pais;
        this.nombre_ciudad = nombre_ciudad;
    }

    public Integer getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Integer id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public Integer getValor_ciudad() {
        return valor_ciudad;
    }

    public void setValor_ciudad(Integer valor_ciudad) {
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
