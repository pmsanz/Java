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
public class Vendedor extends Persona {
    
    private int cantAutosVendidos;

    public Vendedor(int cantAutosVendidos, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }
    
    @Override
    public String toString()
    {
    String resultado;
    
    
    resultado = "Nombre: " + super.getNombre() + " Apellido: " + super.getApellido() + " Numero de Documento: " + super.getNumeroDocumento() + " Cantidad Vendida: " + this.getCantAutosVendidos();
        
    return resultado;
    
    }
    
    
    
    
}
