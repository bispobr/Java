/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Ave extends Animal {
    
    public Ave(String nome, String classe) {
        super(nome, classe);
    }
    
    @Override
    public void falar(){
        System.out.println("Ave Falando !!!");
    }
    
    public void voar (int valor){
        
    }
}
