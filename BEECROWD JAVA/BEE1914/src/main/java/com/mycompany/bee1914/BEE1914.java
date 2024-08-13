/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1914;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1914 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int casos = t.nextInt();
        
        for (int i = 0; i < casos; i++) {
          
            String jogador1 = t.next();
            String escolha1 = t.next();
            String jogador2 = t.next();
            String escolha2 = t.next();
            
            int jogada1 = t.nextInt();
            int jogada2 = t.nextInt();
            
           String venceu = (jogada1 + jogada2) % 2 == 1 ? "IMPAR": "PAR";
            
            
            if (escolha1.equals(venceu)) {
                System.out.println(jogador1);
            } else if (escolha2.equals(venceu)) {
                System.out.println(jogador2);
            }
           
           
           
        }
    }
}
