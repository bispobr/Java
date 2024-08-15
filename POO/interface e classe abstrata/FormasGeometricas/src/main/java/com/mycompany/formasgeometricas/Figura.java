/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;

/**
 *
 * @author bispo
 */
public abstract class Figura {
    private String cor;

     //Construtor, getters e setters
    public Figura(String cor) {
        this.cor = cor;
    }
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // metodos
    @Override
    public String toString() {
        return "Figura{"+super.toString() + "cor=" + cor + '}';
    }

    
    

    
    
    
}
