/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author psanz
 */
public class CompradoresVentanaController implements Initializable {

    @FXML
    private TableColumn<?, ?> tblNom;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnBorrar;
    @FXML
    private Label lblApellido;
    @FXML
    private Label lblNro;
    @FXML
    private Label lblVendidos;
    @FXML
    private Label lblNombre;
    @FXML
    private Label lblDatos;
    @FXML
    private Button btnCerrar;
    @FXML
    private Label lblPresupuesto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
