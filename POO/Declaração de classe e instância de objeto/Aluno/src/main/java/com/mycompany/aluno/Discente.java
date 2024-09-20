/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aluno;

/**
 *
 * @author bruno
 */
public class Discente {
    
    private String nome;
    private int matricula;
    private double notap1;
    private double notap2;
    private double notat1;

    public Discente(String nome, int matricula, double notap1, double notap2, double notat1) {
        this.nome = nome;
        this.matricula = matricula;
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notat1 = notat1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(int notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(int notap2) {
        this.notap2 = notap2;
    }

    public double getNotat1() {
        return notat1;
    }

    public void setNotat1(int notat1) {
        this.notat1 = notat1;
    }
    
    public double media (){
      double media = ((getNotap1() * 2.5) + (getNotap2() * 2.5) + (getNotat1() * 2)) / (7);
      return media;
    }
    
    public double provafinal(){
        double media = media();
        if (media <=7) {
             return 7 - media;
        }
        return 0;
    }
    
    
}
