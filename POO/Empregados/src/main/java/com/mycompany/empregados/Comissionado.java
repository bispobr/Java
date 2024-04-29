/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregados;

/**
 *
 * @author bispo
 */
public class Comissionado extends Empregado {
     private double totalVendas;
     private double taxaComissao;
     
     //construtor

    public Comissionado(double totalVendas, double taxaComissao, String nome, String Sobrenome, String cpf) {
        super(nome, Sobrenome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }
     
    
    //gettes e seters

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    
     // metodos
    
     @Override
    public void vencimento(){
        System.out.println("vencimento Comissionado");
    }
}
