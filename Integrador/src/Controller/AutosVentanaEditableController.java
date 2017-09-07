/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Exceptions.NonNumberException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author psanz
 */
public class AutosVentanaEditableController implements Initializable {

    @FXML
    private Button btnOk;
    @FXML
    private Button btnCancelar;
    @FXML
    private TextField txtAlto;
    @FXML
    private TextField txtAncho;
    @FXML
    private TextField txtLargo;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextArea fieldEquipamiento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnOk_Click(ActionEvent event) {
    if (CompletarCampos())
    {
    //aprobar accion.
        
    }
    
    
    }

    @FXML
    private void btnCancelar_Click(ActionEvent event) {
    }

    @FXML
    private void txtAlto_Click(ActionEvent event) {
    }

    @FXML
    private void txtAncho_Click(ActionEvent event) {
    }

    @FXML
    private void txtLargo_Click(ActionEvent event) {
    }

    @FXML
    private void txtPrecio_Click(ActionEvent event) {
    }
    
    private Boolean CompletarCampos(){
    
    
        if (txtAlto.getText().length() == 0){
        AlertarCampo("Alto");
        txtAlto.requestFocus();
        return false;
        }
        if (txtAncho.getText().length() == 0){
        AlertarCampo("Ancho");
         txtAncho.requestFocus();
         return false;
        }
        if (txtLargo.getText().length() == 0){
        AlertarCampo("Largo");
         txtLargo.requestFocus();
         return false;
        }
        if (txtPrecio.getText().length() == 0){
        AlertarCampo("Precio");
        txtPrecio.requestFocus();
        return false;
        }
        if (fieldEquipamiento.getText().length() == 0){
        AlertarCampo("Equipamiento");
        fieldEquipamiento.requestFocus();
        return false;
        }
                            
        return true;             
    
    }
    
    private void AlertarCampo(String nombreCampo)
    {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Completar campos");
        alert.setContentText("El campo " + nombreCampo + " no puede estar vacio.");
        alert.showAndWait();
                
    }
    
    public Boolean ValidarNumerico(String valor)
    {
       Boolean resultado = false;
        //Valida que el dato sea numerico
        try{
       
           Double valorNumerico = Double.parseDouble(valor);
            resultado = true;
       }
       catch ( Exception e){
       
           throw new NonNumberException();
       
       }
         
        return resultado;
    }
    
    
    
    
    
}
