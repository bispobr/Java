/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphone;

/**
 *
 * @author bispo
 */
public class Contatos {
    public String nome;
    public String nmero;
    public String email;
    public String endereco;
    public boolean favorito;

    public Contatos(String nome, String nmero, String email, String endereco) {
        this.nome = nome;
        this.nmero = nmero;
        this.email = email;
        this.endereco = endereco;
        this.favorito = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNmero() {
        return nmero;
    }

    public void setNmero(String nmero) {
        this.nmero = nmero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    
    
      
}
