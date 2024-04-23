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

    //construtor, getters , setters

    public Circulo(String cor ,double raio) {
        super(cor);
        this.raio = raio;
    }
   
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    // metodos
    public double area(){
        return 0; 
    }
    
    public double diametro(){
        return (this.raio * 3.14)*2;
    }

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    
    
    
}
