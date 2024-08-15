/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;

/**
 *
 * @author bispo
 */
public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    //Construtor, getters e setters
    public Retangulo(String cor,double lado1, double lado2) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    // metodos
    public  double area(){
        
        return this.lado1 * this.lado2;
        
    }

    @Override
    public String toString() {
        return "Retangulo{"+ super.toString() + "lado1=" + this.lado1 + ", lado2=" + this.lado2 + '}';
    }
}
