/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formasgeometricas;

/**
 *
 * @author bispo
 */
public class FormasGeometricas {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado("Verde",2,2);
        Triangulo t1 = new Triangulo("Azul",5,12);
        Circulo c1 = new Circulo ("Rosa",10.2);
        Retangulo r1 =  new Retangulo ("Vermelho",33,12);
        
        q1.setCor("Preto");
        q1.setLado1(3);
        
        System.out.println("Quadrado");
        System.out.println(q1.toString());
        System.out.println("Area " +q1.area());
        
        System.out.println("Triangulo");
        System.out.println(t1.toString());
        System.out.println("Area " + t1.area());
        
        System.out.println("circulo");
        System.out.println(c1.toString());
        System.out.println("Area " + c1.area());
        System.out.println("Diametro " + c1.diametro());
        
        System.out.println("Retangulo");
        System.out.println(r1.toString());
        System.out.println("Area" + r1.area());
        
    }
}
