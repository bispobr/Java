/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1094;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1094 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        int quantidadeRato = 0;
        int quantidadeSapo = 0;
        int quantidadeCoelho = 0;
        int total = 0;
        int caso = t.nextInt();
        for(int c = 0;c<caso;c++){
           int quantia = t.nextInt();
           String tipo = t.next();
           if (tipo.equalsIgnoreCase("R")){
               quantidadeRato +=quantia;
           } else if (tipo.equalsIgnoreCase("S")){
               quantidadeSapo += quantia;
           } else if (tipo.equalsIgnoreCase("C")){
               quantidadeCoelho += quantia;
           }
        }   
        total = quantidadeCoelho + quantidadeSapo + quantidadeRato;
        System.out.println("Total: "+ total + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeCoelho );
        System.out.println("Total de ratos: " + quantidadeRato );
        System.out.println("Total de sapos: " + quantidadeSapo );
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ((quantidadeCoelho * 100.0) / total)) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ((quantidadeRato * 100.0) / total)) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f",((quantidadeSapo * 100.0) / total)) + " %");
    }
}
