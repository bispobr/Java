/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author n
 */
public class Mamifero extends Animal {
    private String corPelo;

    
    //gettes e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

    @Override
    public void locomover() {
        System.out.println("Cachoro...locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Cachoro...Alimantando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachoro...latindo");
    }
    
    
}
