/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cabeza_algodon;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Angle Vial
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3310/pruebapro","root","");
                    System.out.println("Conectado");
    }catch(Exception e){
        System.out.print("Error al conectar");
    }
    }
    public Connection getConnection(){
        return con;
    }
    
}
