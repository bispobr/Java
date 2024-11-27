/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregado;

/**
 *
 * @author bispo
 */
public class Comissionado extends Funcionario {

    private double totalVenda;
    private double taxaComissao;

    public Comissionado(String nome, String Sobrenome, String Cpf, double totalvenda, double taxa) {
        super(nome, Sobrenome, Cpf);
        this.totalVenda = totalvenda;
        this.taxaComissao = taxa;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public String toString() {
        return "Comissionado{" + "totalVenda=" + totalVenda + ", taxaComissao=" + taxaComissao + '}';
    }

    @Override
    public void vencimento() {
        System.out.println("vencmento Comisionado");
    }

}
