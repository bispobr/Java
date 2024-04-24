/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salarobo;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class TestarRobo {
   private Ambiente sala;
   private Robo mig;
   private Scanner entrada;
   
   
   //metodo
   public  void definirAmbiente(){
       System.out.println("Quantidade de linhas:");
       int qtdLinhas = entrada.nextInt();
       System.out.println("Quantidade de Colunas:");
       int qtdColunas = entrada.nextInt();
       sala = new Ambiente(qtdLinhas,qtdColunas);
       
       
   }
   
   public void iniciarRobo(){
       System.out.println("Posição inicial robo - Linha:");
       int posLinha = entrada.nextInt();
       System.out.println("Posição Inicial robo - coluna:");
       int posColuna = entrada.nextInt();
       
       mig = new Robo (posLinha,posColuna,sala);
   }
   
   public void menu(){
       System.out.println("============menu============");
       System.out.println("""
                          1 - Andar para Frente
                          2 - Andar para Tr\u00e1s
                          3 - Parar
                          4 - Virar para Direita
                          5 - Virar para Esquerda
                          6 - Sair """);
       System.out.println("============================");
   }
       
    
   
    
}
