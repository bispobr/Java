/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domigo1;

/**
 *
 * @author n
 */
public class Conta_jogador {
    public String nome;
    protected String Datanasc;
    private String CPF;
    private String Dados;
    private String Usuario;
    private String senha;
    
    public void Status () {
        System.out.println("nome:" + this.nome);
        System.out.println("data de nascimento:" + this.Datanasc);
        System.out.println("CPF:" + this.CPF);
        System.out.println("Dados:" + this.Dados);
        System.out.println("Usuario:" + this.Usuario);
        System.out.println("senha:" + this.senha);
    }
    
   public  void ValidarCPF(){
        if (this.CPF != null){
            System.out.println("CPF VALIDADO!!!!");
        }else {
            System.out.println("cpd Não validado, esta vazio");
        }
    }
   
   public void ValidarUsuario(){
       if (this.Usuario != null){
           System.out.println("Usuario VALIDADO!!!");
       }else {
           System.out.println("Esta vazio, USUARIO NÃO VALIDADO!!!");
       }
   }
   
   public void CriarContajogador () {
       this.nome = "padão1";
       this.Datanasc = "xx/xx/xxxx";
       this.CPF = "000.000.000-00";
       this.Dados = "Dadospadrão";
       this.Usuario = "usuariopadrão";
       this.senha = "9999999";
   }
   
   public void AlterarSenha() {
       if (this.senha != null){
           this.senha = "metodosenhaalterada";
       } else {
           System.out.println("senha esta vazia!!!!");
       }
   }
    
}
