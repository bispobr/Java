/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author bispo
 */
public class Veiculos {
    private String placa;
    private int ano;

    
    //Construtor
    public Veiculos(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    //getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //metodo
    
    public String exibirDados() {
        return "Veiculos{" + "placa=" + placa + ", ano=" + ano + '}';
    }

    
    
    
    
    
    
}
