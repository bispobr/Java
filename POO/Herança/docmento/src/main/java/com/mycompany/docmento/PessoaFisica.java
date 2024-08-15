/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docmento;

/**
 *
 * @author bispo
 */
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }
    
    
}
