/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02exercicio01;


public class Celular {
    float tela;
    int bateria;
    String cor;
    String processador;
    int memoria;
    boolean ligado;
    
   void ligar (){
       if (this.bateria > 0){
           this.ligado = true;
           System.out.println("Ligando!!!");
       }else{
           System.out.println("Sem bateria!!! não vai ligar");
       }
   }
   
   void desligar (){
       this.ligado = false;
   }
   void fazerchamada (){
       if(this.ligado == true){
           System.out.println("Fazendo chamada!!!");
       }
   }
   void status (){
       System.out.println("Esta ligado ? " + this.ligado);
       System.out.println("Quantidade de bateria : " + this.bateria);
       System.out.println("Modelo processador :" + this.processador);
       System.out.println("tamanho de tela : " + this.tela);
       System.out.println("Cor: " + this.cor);
       System.out.println("Quantidade de memoria: " +this.memoria);
   }
}
