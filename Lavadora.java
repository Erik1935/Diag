/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadora;

import java.util.logging.Logger;

/**
 *
 * @author erikj
 */
public class Lavadora {
private String marca = "Mabe";
private String modelo = "Centrifugado XW61";
private String numeroSerie = "1234ABCD";
private int capacidad = 10 ;

    public Lavadora() {
    }
   public Lavadora(String marca,String modelo) {
       this.marca = marca;
       this.modelo = modelo;
    }
   public void agregarRopa(int cantidad){
       System.out.println("Cantidad de ropa: "+cantidad);
   }
    //Muestra la cantidad de ropa que tiene la lavadora

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
   
}
