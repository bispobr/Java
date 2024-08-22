/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregado;

/**
 *
 * @author bispo
 */
public class Funcionario {

    String nome;
    private String Sobrenome;
    private String Cpf;

    public Funcionario(String nome, String Sobrenome, String Cpf) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.Cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    
    
    public void vencimento(){
        System.out.println("vencmento Funcionario");
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", Sobrenome=" + Sobrenome + ", Cpf=" + Cpf + '}';
    }
    
    
}
