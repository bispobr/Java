/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1515;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1515 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String vencedor = "";
        int primeiro  = 9999999;
        while (true) {
            int n = t.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                String planeta = t.next();
                int ano = t.nextInt();
                int distancia = t.nextInt();
                
                if (i == 0) {
                    vencedor = planeta;
                    primeiro = ano-distancia;
                }
                
                if (ano-distancia < primeiro) {
                    vencedor = planeta;
                    primeiro = ano-distancia;
                }
            }
            System.out.println(vencedor);
        }

    }
}
