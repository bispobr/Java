/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregado;

/**
 *
 * @author bispo
 */
public class Horista extends Funcionario {

    private double precoHora;
    private double horasTrabalhada;

    public Horista(String nome, String Sobrenome, String Cpf, double preco,double horas) {
        super(nome, Sobrenome, Cpf);
        this.precoHora = preco;
        this.horasTrabalhada = horas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(double horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    @Override
    public String toString() {
        return "Horista{" + "precoHora=" + precoHora + ", horasTrabalhada=" + horasTrabalhada + '}';
    }
    
    @Override
     public void vencimento() {
        System.out.println("vencmento Horista");
    }

}
