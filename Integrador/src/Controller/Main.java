package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.Auto;
import Model.Comprador;
import Model.Vendedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Pablo
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

    
    
// Arma la consulta y la ejecuta
        try (Connection laConexion = AdministradorDeConexiones.obtenerConexion()) {
            // Arma la consulta y la ejecuta
            
            String laConsulta = "SELECT * FROM Alumnos";
            Statement stmtConsulta = laConexion.createStatement();
            ResultSet rs = stmtConsulta.executeQuery(laConsulta);
            // Muestra los datos
            
            while( rs.next() ){
                
                
                
            }// Cierra el Statement y la Connection
            stmtConsulta.close();
// launch(args);
//        Instanciar un auto utilizando el constructor completo
//         Informar el auto utilizando el metodo toString()
//         Instanciar un comprador utilizando el constructor completo
//         Informar el comprador utilizando el metodo toString()
//         Instanciar un vendedor utilizando el constructor completo
//         Informar el vendedor utilizando el metodo toString()
//       Auto au;
//       au = new Auto("Ford", "Fiesta", "Negro", 155 , 180, 263);
//       System.out.println(au.toString());
//       
//       Comprador cmp;
//       cmp = new Comprador(150000.00, "Pablo" , "Sanz", "36.554.465");
//       System.out.println(cmp.toString());
//       
//       Vendedor vnd;
//       vnd = new Vendedor(20,"Vendedor Juancito", "Gomez","17.050.620");
//       System.out.println(vnd.toString());
////       
//
//QUERYES
//USE DATOS_ALUMNOS;
//
//CREATE TABLE Alumnos (
//AlumnosId INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
//Nombre VARCHAR(30) NOT NULL,
//Apellido VARCHAR(30) NOT NULL
//);
//
//
//INSERT INTO Alumnos ('Pablo','Rodriguez');




        }
       
    }
    
}
