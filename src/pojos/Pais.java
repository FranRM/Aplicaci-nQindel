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
public class Pais implements Serializable {

    private String nombre_pais, codigo_pais;
    private int id_pais, valor_pais;

    public Pais() {
    }

    public Pais(String nombre_pais, String codigo_pais, int id_pais, int valor_pais) {
        this.nombre_pais = nombre_pais;
        this.codigo_pais = codigo_pais;
        this.id_pais = id_pais;
        this.valor_pais = valor_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public String getCodigo_pais() {
        return codigo_pais;
    }

    public void setCodigo_pais(String codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public int getValor_pais() {
        return valor_pais;
    }

    public void setValor_pais(int valor_pais) {
        this.valor_pais = valor_pais;
    }

}
