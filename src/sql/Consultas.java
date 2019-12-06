/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import java.util.List;
import org.hibernate.Session;
import pojos.Pais;

/**
 *
 * @author Femio
 */
public class Consultas {
    private Session s;
    public static String saida;

    public Consultas(Session s) {
        this.s = s;
    }
    
    public void consultaAmplia(){
        List<Object[]> ciudades = s.createSQLQuery("SELECT * FROM Ciudad").list();
        for (Object[] objects : ciudades) {
           Integer id=(Integer)objects[0];
           String name=(String)objects[1];
           Integer pais=(Integer)objects[2];
           List<Pais> nomespaises = s.createCriteria(Pais.class).list();
           List<Object[]>sedeJJOO = s.createSQLQuery("select id_tipo_JJOO from sede_JJOO where sede = "+id+";").list();
           List<Object[]>vecesSede = s.createSQLQuery("select count(*) from sede_JJOO where sede = "+id+";").list();
           Integer valor=(Integer)objects[3]; 
          if(valor!=null){
               if(!sedeJJOO.isEmpty()){
                   String tipo=String.valueOf(sedeJJOO.get(0));
                   List<Object[]>tipoJJOO = s.createSQLQuery("select descripcion_tipo from tipo_JJOO where id_tipo_JJOO = "+tipo+";").list();
                   String descripción=String.valueOf(tipoJJOO.get(0));
                   System.out.println("["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+valor+", "+descripción+", veces sede olímpica:"+vecesSede.get(0)+"]");
                   saida = saida + "["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+valor+", "+descripción+", veces sede olímpica:"+vecesSede.get(0)+"]\n";
               }else{
                   System.out.println("["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+valor+" e nunca foi sede olímpica.]");
                   saida = saida + "["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+valor+" e nunca foi sede olímpica.]\n";
               }
           }else{
               if(!sedeJJOO.isEmpty()){
                   String tipo=String.valueOf(sedeJJOO.get(0));
                   List<Object[]>tipoJJOO = s.createSQLQuery("select descripcion_tipo from tipo_JJOO where id_tipo_JJOO = "+tipo+";").list();
                   String descripción=String.valueOf(tipoJJOO.get(0));
                   System.out.println("["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+nomespaises.get(pais-1).getValor_pais()+", "+descripción+", veces sede olímpica:"+vecesSede.get(0)+"]");
                   saida = saida + "["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+nomespaises.get(pais-1).getValor_pais()+", "+descripción+", veces sede olímpica:"+vecesSede.get(0)+"]\n";
               }else{
                   System.out.println("["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+nomespaises.get(pais-1).getValor_pais()+" e nunca foi sede olímpica.]");
                   saida = saida + "["+pais+", "+nomespaises.get(pais-1).getNombre_pais()+", "+id+", "+name+", "+nomespaises.get(pais-1).getValor_pais()+" e nunca foi sede olímpica.]\n";
               }
           }
        }
    }
}
