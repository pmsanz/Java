/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pablo
 */
public class Comprador extends Persona {
    
    private Double presupuesto;

    public Comprador(Double presupuesto, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    @Override
    public String toString(){
    String resultado ;
    
    resultado = "Nombre: " + super.getNombre() + " Apellido: " + super.getApellido() + " Numero de Documento: " + super.getNumeroDocumento() + " Presupuesto: " + this.getPresupuesto();
    
    
    return resultado;
    }
    
}
