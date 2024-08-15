/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula14;

/**
 *
 * @author n
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    //getters e setters, construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    
    
   //metodos
       public void viuMaisUm(){
           
       } 

    @Override
    public String toString() {
        return "Gafanhoto{"+super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
       
       
}
