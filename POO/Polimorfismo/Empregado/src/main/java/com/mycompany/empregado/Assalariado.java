/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregado;

/**
 *
 * @author bispo
 */
public class Assalariado extends Funcionario {
    
     private double salario;

    public Assalariado(String nome, String Sobrenome, String Cpf, double salario) {
        super(nome, Sobrenome, Cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
     @Override
    public void vencimento(){
        System.out.println("vencmento Assalariado");
    }

    @Override
    public String toString() {
        return "Assalariado{" + "salario=" + salario + ", nome = " + this.getNome()+'}';
    }

   

    
    
    
    
    
    
}
