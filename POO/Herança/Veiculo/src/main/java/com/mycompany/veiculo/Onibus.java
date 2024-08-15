/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author bispo
 */
public class Onibus extends Veiculos {
    private int assentos;

    public Onibus(String placa, int ano,int assentos) {
        super(placa,ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    //metodo
    
    public String exibirDados() {
        return "Onibus{"+ super.exibirDados() + "assentos=" + assentos + '}';
    }
    
    
}
