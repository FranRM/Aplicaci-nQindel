/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioqindel;

import java.sql.Connection;
import org.hibernate.Session;
import sql.Consultas;
import sql.CreadorEsquema;

/**
 *
 * @author Femio
 */
public class AplicacioQindel {

    /**
     * @param args the command line arguments
     */
    public static Consultas q;
    static FramePrincipal frame = null;

    public static void main(String[] args) {
        Session sesion = NewHibernateUtil.getSession();
        Connection c = CreadorEsquema.conexion();
        q = new Consultas(sesion);
        frame = new FramePrincipal();
        frame.setVisible(true);
    }
}
