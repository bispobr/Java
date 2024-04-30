/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Bemtevi extends Ave {
    //construtor
    public Bemtevi(String nome, String classe) {
        super(nome, classe);
    }
    
    //gettes  e setters

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    //metodo
    
    @Override
    public void falar (){
        System.out.println("BenTevi pasando!!!");
    }
}
