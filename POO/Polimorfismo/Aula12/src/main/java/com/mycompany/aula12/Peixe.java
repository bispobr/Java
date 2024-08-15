/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author n
 */
public class Peixe  extends Animal{
    private String corScama;

    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
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
    
    

    public void soltarBolhas(){
        System.out.println("Peixe...soltando Bolhas");
    }
    @Override
    public void locomover() {
        System.out.println("peixe...locomovendo");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe...locomovendo");
    }

    @Override
    public void emitirSom() {
            System.out.println("peixe...locomovendo");
    }
    
    
}
