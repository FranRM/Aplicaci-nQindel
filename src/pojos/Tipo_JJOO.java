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
public class Tipo_JJOO implements Serializable{
    private String descripcion_tipo;
    private int id_tipo_JJOO;

    public Tipo_JJOO() {
    }

    public Tipo_JJOO(String descripcion_tipo, int id_tipo_JJOO) {
        this.descripcion_tipo = descripcion_tipo;
        this.id_tipo_JJOO = id_tipo_JJOO;
    }

    public String getDescripcion_tipo() {
        return descripcion_tipo;
    }

    public void setDescripcion_tipo(String descripcion_tipo) {
        this.descripcion_tipo = descripcion_tipo;
    }

    public int getId_tipo_JJOO() {
        return id_tipo_JJOO;
    }

    public void setId_tipo_JJOO(int id_tipo_JJOO) {
        this.id_tipo_JJOO = id_tipo_JJOO;
    }
    
}
