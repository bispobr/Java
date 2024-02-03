/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author n
 */
public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
            System.out.println("ave...soltando Bolhas");
    }

    @Override
    public void alimentar() {
        System.out.println("ave...soltando Bolhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("ave...soltando Bolhas");
    }
    
    public void fazerNinho(){
        System.out.println("ave....ninho");
    }
    
    
}
