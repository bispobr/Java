/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;


public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
    public void status () {
        System.out.println("modelo " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está Tampada " + this.tampada);
        System.out.println("Sua ponta é " + this.ponta);
        System.out.println("Status da carga " + this.carga);
        System.out.println("----------------------------------");
    }
    
 public void rabiscar () {
     if (this.tampada == true){
         System.out.println("Esta tampada não dá para rabiscar");
     } else {
         System.out.println("Está Destampada, estou Rabiscando !!!");
     }
}

public void tampar (){
this.tampada = true;
}

public void destampar (){
    this.tampada = false;

}
}

 