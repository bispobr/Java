/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author bispo
 */
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    
    public String exibirDados() {
        return "Caminhao{" + "eixos=" + eixos + '}';
    }

    
    
    
    
}
