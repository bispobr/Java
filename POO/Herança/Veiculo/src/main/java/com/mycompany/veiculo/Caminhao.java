/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author bispo
 */
public class Caminhao extends Veiculos {
    private int eixos;

    // construtor
    public Caminhao(String placa,int ano ,int eixos) {
        super(placa,ano);
        this.eixos = eixos;
    }

   //getters e setters

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    // metodo
    @Override
    public String toString() {
        return "Caminhao{" + super.exibirDados() + "eixos=" + eixos + '}';
    }

    
    

    
    
    
    
}
