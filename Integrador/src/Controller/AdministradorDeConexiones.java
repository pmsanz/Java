/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;

import java.sql.DriverManager;

/**
 *
 * @author educacionit
 */
public abstract class AdministradorDeConexiones {

    
    
public static Connection obtenerConexion() throws Exception

{
    
       // Establece el nombre del driver a utilizar

        String dbDriver = "com.mysql.jdbc.Driver";

            

            // Establece la conexion a utilizar

        String dbConnString = "jdbc:mysql://localhost";

            

            // Establece el usuario de la base de datos

        String dbUser = "root";

       

        // Establece la contraseña de la base de datos

        String dbPassword = "";

       

        // Establece el driver de conexion

        Class.forName(dbDriver).newInstance();

       

        // Retorna la conexion

        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
    
}



}