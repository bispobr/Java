/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Mamifero extends Animal {
    private int velocidade;

    //construtor
    public Mamifero(String nome, String classe, int velocidade) {
        super(nome, classe);
        this.velocidade = velocidade;
    }
    
    //gettees e setters

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    //metodos
    
    public void correr (){
        System.out.println("Mamifero Corendo a " + this.velocidade +" KM/H !!!");
    }

       
    
}
