/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2031;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2031 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();

        for (int i = 0; i < casos; i++) {
            String A = t.next();
            String B = t.next();
            
            if ("ataque".equals(A) && "ataque".equals(B)) {
                System.out.println("Aniquilacao mutua");
            } else if ("pedra".equals(A) && "pedra".equals(B)) {
                System.out.println("Sem ganhador");
            } else if ("papel".equals(B) && "papel".equals(A)) {
                System.out.println("Ambos venceram");
            } else if ("ataque".equals(A)) {
                System.out.println("Jogador 1 venceu");
            } else if ("ataque".equals(B)) {
                System.out.println("Jogador 2 venceu");
            } else if ("pedra".equals(A)) {
                System.out.println("Jogador 1 venceu");
            } else if ("pedra".equals(B)) {
                System.out.println("Jogador 2 venceu");
                        
            }

        }

    }
}
