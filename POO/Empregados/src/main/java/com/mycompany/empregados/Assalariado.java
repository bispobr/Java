/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregados;

/**
 *
 * @author bispo
 */
public class Assalariado extends Empregado {
    private double salario;
    
    //construtor

    public Assalariado(double salario, String nome, String Sobrenome, String cpf) {
        super(nome, Sobrenome, cpf);
        this.salario = salario;
    }
    
    // getters e setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //metodos
    
    @Override
    public void vencimento(){
        System.out.println("Vencimento Assalariado");
    }
}
