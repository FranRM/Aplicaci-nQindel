/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Femio
 */
public class CreadorEsquema {
    
    public static Connection conexion() {
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root");
            System.out.println("Conexion realizada satisfactoriamente.");
        } catch (SQLException sqle1) {
            System.out.println("Erro na conexión: " + sqle1.getMessage());
        }
        creaTaboas(c);
        return c;
    }

    public static void creaTaboas(Connection c) {
        try {
            Statement creacion = c.createStatement();
            creacion.execute("drop database if exists juegosolimpicos;");
            creacion.execute("create database if not exists juegosolimpicos;");
            creacion.execute("use juegosolimpicos;");
            creacion.execute("create table if not exists Pais("
                    + "id_pais int(11) NOT NULL,"
                    + "nombre_pais varchar(64) NOT NULL,"
                    + "codigo_pais varchar(2) NOT NULL,"
                    + "valor_pais varchar(11) NOT NULL,"
                    + "primary key(id_pais)"
                    + ");");
            creacion.execute("create table if not exists Ciudad("
                    + "id_ciudad int(11) NOT NULL,"
                    + "nombre_ciudad varchar(64) NOT NULL,"
                    + "id_pais int(11) NOT NULL,"
                    + "valor_ciudad int(11) DEFAULT NULL,"
                    + "primary key (id_ciudad),"
                    + "key fk_ciudad_pais(id_pais),"
                    + "constraint fk_ciudad_pais "
                    + "foreign key (id_pais) references Pais(id_pais) "
                    + "on update cascade on delete cascade" 
                    + ");");
            creacion.execute("create table if not exists Tipo_JJOO("
                    + "id_tipo_JJOO int(11) NOT NULL,"
                    + "descripcion_tipo varchar(32) NOT NULL,"
                    + "primary key(id_tipo_JJOO)"
                    + ");");
            creacion.execute("create table if not exists Sede_JJOO("
                    + "año int(11) NOT NULL,"
                    + "id_tipo_JJOO int(11) NOT NULL,"
                    + "sede int(11) NOT NULL,"
                    + "primary key(año,id_tipo_JJOO),"
                    + "key fk_sede_JJOO_ciudad(sede),"
                    + "key fk_sede_JJOO_tipo_JJOO(id_tipo_JJOO),"
                    + "constraint fk_sede_JJOO_ciudad "
                    + "foreign key (sede) references Ciudad(id_ciudad),"
                    + "constraint fk_sede_JJOO_tipo_JJOO "
                    + "foreign key (id_tipo_JJOO) references Tipo_JJOO(id_tipo_JJOO)"
                    + ");");
            System.out.println("Taboas creadas correctamente.");
            creacion.execute("insert into Pais(id_pais, nombre_pais,"
                    + " codigo_pais, valor_pais) values "
                    + "(1,\"España\",\"ES\",100),(2,\"Portugal\",\"PT\",200),"
                    + "(3,\"Francia\",\"FR\",50),(4,\"Italia\",\"IT\",150);");
            creacion.execute("insert into Ciudad values(1,\"A Coruña\",1,93),"
                    + "(2,\"Madrid\",1,NULL),(3,\"Barcelona\",1,124),"
                    + "(4,\"Lisboa\",2,134),(5,\"Oporto\",2,NULL),"
                    + "(6,\"Coimbra\",2,NULL),(7,\"Chamonix\",3,123),"
                    + "(8,\"París\",3,4),(9,\"Niza\",3,NULL),"
                    + "(10,\"Milán\",4,135),(11,\"Roma\",4,125),(12,\"Turín\",4,190);");
            creacion.execute("insert into Tipo_JJOO values(1,\"Invierno\"),(2,\"Verano\");");
            creacion.execute("insert into Sede_JJOO values(1992,2,3),(1924,1,7),(1900,2,8),(1924,2,8),(1960,2,11),(2006,1,12);");
            System.out.println("Carga de datos realizada correctamente");
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
}
