/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () {
        System.out.println("modelo " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está Tampada " + this.tampada);
        System.out.println("Sua ponta é " + this.ponta);
        System.out.println("Status da carga " + this.carga);
        System.out.println("----------------------------------");
    }
    
 void rabiscar () {
     if (this.tampada == true){
         System.out.println("Esta tampada não dá para rabiscar");
     } else {
         System.out.println("Está Destampada, estou Rabiscando !!!");
     }
}

void tampar (){
this.tampada = true;
}

void destampar (){
    this.tampada = false;

}
}

 