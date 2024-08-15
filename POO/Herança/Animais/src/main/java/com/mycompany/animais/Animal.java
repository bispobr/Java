/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Animal {
    private String nome;
    protected String classe;
    
    //construtor

    public Animal(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }
    
    //gettes e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    // metodo
    
    public void falar(){
        System.out.println("Animal Falando!!!");
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", classe=" + classe + '}';
    }
    
    
    
    
}




