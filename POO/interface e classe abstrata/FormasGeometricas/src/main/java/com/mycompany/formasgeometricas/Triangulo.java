/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;

/**
 *
 * @author bispo
 */
public class Triangulo  extends Figura{
    private double base;
    private double altura;

     //Construtor, getters e setters
    
    public Triangulo( String cor,double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //metodos
    
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Triangulo{"+super.toString() + "base=" + base + ", altura=" + altura + '}';
    }
}
