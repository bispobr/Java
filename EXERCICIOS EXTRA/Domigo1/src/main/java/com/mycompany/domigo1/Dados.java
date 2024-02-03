/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domigo1;

/**
 *
 * @author n
 */
public class Dados {
    private String rua;
    private int numero;
    private String cidade;
    private String email;
    private String telefone;

    public Dados() {
        this.email = "teste@padrao.com";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void AlterarDados (String r, int n,String c, String e, String t){
        this.setRua(r);
        this.setNumero(n);
        this.setCidade(c);
        this.setEmail(e);
        this.setTelefone(t);
    }
    
    public void status(){
        System.out.println("Rua: " + this.getRua());
        System.out.println("numero;" + this.getNumero());
        System.out.println("cidade:" + this.getCidade());
        System.out.println("email" + this.getEmail());
        System.out.println("telefone" + this.getTelefone());
    }
    
}
