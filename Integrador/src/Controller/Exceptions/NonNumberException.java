/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Exceptions;

import javafx.scene.control.Alert;

/**
 *
 * @author psanz
 */
public class NonNumberException extends  NumberFormatException {
    
    public NonNumberException()
    {
    
        super("El valor debe ser numerico");
    
//        Alert alert = new Alert(Alert.AlertType.ERROR);
//        alert.setTitle("Error");
//        alert.setContentText("El valor ingresado debe ser numerico");
//        alert.showAndWait();
    }
    
   
    
    
}
