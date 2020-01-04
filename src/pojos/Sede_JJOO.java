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
public class Sede_JJOO implements Serializable {

    private int año;
    private Ciudad sede;
    private Tipo_JJOO id_tipo_JJOO;

    public Sede_JJOO() {
    }

    public Sede_JJOO(int año, Ciudad sede, Tipo_JJOO id_tipo_JJOO) {
        this.año = año;
        this.sede = sede;
        this.id_tipo_JJOO = id_tipo_JJOO;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Ciudad getSede() {
        return sede;
    }

    public void setSede(Ciudad sede) {
        this.sede = sede;
    }

    public Tipo_JJOO getId_tipo_JJOO() {
        return id_tipo_JJOO;
    }

    public void setId_tipo_JJOO(Tipo_JJOO id_tipo_JJOO) {
        this.id_tipo_JJOO = id_tipo_JJOO;
    }

}
