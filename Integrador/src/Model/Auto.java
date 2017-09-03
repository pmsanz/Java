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
public class Auto extends Vehiculo{
    
    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    
    @Override
    public String toString(){
    String resultado = "";
        
    resultado += "Color del auto:" + this.color + "Marca del auto:" + this.marca + "Modelo del auto:" + this.modelo + "Alto del vehiculo:" + super.getAlto() + "Ancho del vehiculo:" + super.getAncho() + "Largo del Vehiculo:" + super.getLargo();
        
    return resultado;
    
    }
    
    
    
}
