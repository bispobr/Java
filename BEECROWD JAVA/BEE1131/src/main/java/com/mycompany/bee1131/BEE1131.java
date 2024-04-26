/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1131;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1131 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int grenais = 0;
        int qtdVitoriaInter = 0;
        int qtdVitoriaGremio = 0;
        int empate = 0;
        String venceuMais = "";
        while (true){
           int inter = t.nextInt();
           int gremio = t.nextInt();
           grenais+=1;
           
           
           if (inter > gremio){
               qtdVitoriaInter+=1;
           } else if (gremio > inter){
               qtdVitoriaGremio+=1;
           }  else if (inter == gremio){
               empate+=1;
           }
           
           if (qtdVitoriaInter > qtdVitoriaGremio){
               venceuMais = "Inter";
           } else if (qtdVitoriaGremio > qtdVitoriaInter){
               venceuMais = "Gremio";
           } else if (qtdVitoriaGremio == qtdVitoriaInter){
                venceuMais = "Nao houve vencedor";
           }
           
            System.out.println("Novo grenal (1-sim 2-nao)");
            int op = t.nextInt();
            
            if (op == 1){
                continue;
            } else if (op == 2){
                break;
            }
        }
        
        System.out.println(grenais +" grenais");
        System.out.println("Inter:" +qtdVitoriaInter );
        System.out.println("Gremio:"+qtdVitoriaGremio);
        System.out.println("Empates:"+empate);
        System.out.println(venceuMais+" venceu mais");
    }
}
