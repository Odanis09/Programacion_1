/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Odanis Soto
 */
public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/este_login_si","root","");
            System.out.println("CONECTADO");
            
        } catch (Exception e){
            System.out.println("ERROR DE CONEXION BD"+e);
        }
        return cn;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
