/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;

/**
 *
 * @author bispo
 */
public class Circulo  extends Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double area(){
        return 0; 
    }
    
    public double diametro(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    
}
