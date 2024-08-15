/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregados;

/**
 *
 * @author bispo
 */
public class Empregado {
    private String nome;
    private String Sobrenome;
    private String cpf;
    
    // construtor

    public Empregado(String nome, String Sobrenome, String cpf) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.cpf = cpf;
    }
    
    //gettes e setters

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
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //metodos
    
    public void vencimento(){
        System.out.println("Empreagado Venciento");
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", Sobrenome=" + Sobrenome + ", cpf=" + cpf + '}';
    }
    
    
}
