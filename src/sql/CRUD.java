/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import aplicacioqindel.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Sede_JJOO;

/**
 *
 * @author Femio
 */
public class CRUD {

    

    public static void alta(Sede_JJOO sede) {
        Session s = NewHibernateUtil.getSession();
        guardarModificar(s, sede);
        s.close();
    }

    public static void modificacion(Sede_JJOO sede) {
        Session s = NewHibernateUtil.getSession();
        guardarModificar(s, sede);
        s.close();
    }

    public static void borrado(Sede_JJOO sede) {
        Session s = NewHibernateUtil.getSession();
        System.out.println(sede.getSede().getNombre_ciudad()+" foi eliminada.");
        s.beginTransaction();
        s.delete(sede);
        s.getTransaction().commit();
        s.close();
    }

    public static void guardarModificar(Session sesion, Object objeto) {
        try {
            sesion.beginTransaction();
            sesion.saveOrUpdate(objeto);
            sesion.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
