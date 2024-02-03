/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author n
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void status (){
        System.out.println("numconta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono:" + this.getDono());
        System.out.println("saldo: " + this.getSaldo() );
        System.out.println("Status:" + this.isStatus());
        
    }
    
    public void abrirConta (String c) {
        this.setStatus(true);
        this.setTipo(c);
        if (c == "cc"){
            this.setSaldo(50.00f);
        } else if (c == "cp") {
            this.setSaldo(150.00f);
        }
    }
    
    public void fechaConta (){
        if (this.getSaldo() < 0){ 
           System.out.println("Senhor(a)" + this.getDono() + "Voce possui debito negatvo de " + this.getSaldo() + "Sua Conta não pode ser fechada.");
        }else if (this.getSaldo() > 0){
            System.out.println("Senhor(a)" + this.getDono()+ "Você possui saldo na dua conta de R$" +  this.getSaldo() + "Voce deve Sarcar esse valor para poder fechar essa conta."); 
        } else if (this.getSaldo() == 0){
            System.out.println("Senhor(a)" + this.getDono() + "Sua conta foi FECHADA.");
            this.setStatus(false);
        }
        
    }
    
    public void despositar (float v){
        if (this.isStatus() == false){
            System.out.println("senhor(a) "+this.getDono()+" Esta conta esta fechada, não é possivel Depositar");
        } else {
            System.out.println("senhor(a) "+this.getDono()+" Valor de R$" + v + "Depositado!");
            this.setSaldo(this.getSaldo() + v); 
        }
    }
    
    public void sacar (float s){
        if(this.isStatus()== false){
            System.out.println("Senhor(a)"+ this.getDono()+ "esta conta esta fechada, não é possivel sacar"); 
        } else if (s > this.getSaldo()){
            System.out.println("Senhor(a)" +this.getDono()+" Você não possui esse saldo disponivel para saque seu saldo atual é de RS"+ this.getSaldo());
        } else if (s < this.getSaldo()){
            this.setSaldo(this.getSaldo() - s);
             System.out.println("Sacado R$"+ s);
             System.out.println("Seu saldo atual é de:"+ this.getSaldo());
        }
    }
    
    public void pagarMensal(){
        float v;
        if (this.getTipo() == "cc"){
            v = 12;
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Senhor(a)"+ this.getDono() +"Uma anuidade de R$ 12 foi deduzida do seu saldo" );
        } else if (this.getTipo() == "cp"){
            v = 20;
            this.setSaldo(this.getSaldo() - v);
             System.out.println("Senhor(a)"+ this.getDono() +"Uma anuidade de R$ 20 foi deduzida do seu saldo" );
        }
    }
}
