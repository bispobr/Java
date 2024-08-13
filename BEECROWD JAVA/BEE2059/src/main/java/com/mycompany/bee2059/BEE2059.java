/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2059;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2059 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int p = t.nextInt();
        int j1 = t.nextInt();
        int j2 = t.nextInt();
        int r = t.nextInt();
        int a = t.nextInt();

        String jogada = ((j1 + j2) % 2 == 0 ? "PAR" : "IMPAR");

        String escolhaj1 = (p == 1 ? "PAR" : "IMPAR");

        if (r == 0) {
            if (a == 0) {
                if (escolhaj1.equals(jogada)) {
                    System.out.println("Jogador 1 ganha!");
                } else {
                    System.out.println("Jogador 2 ganha!");
                }

            } else{
                System.out.println("Jogador 1 ganha!");
            }
        } else{
            if (a == 1) {
                System.out.println("Jogador 2 ganha!");
            } else{
                 System.out.println("Jogador 1 ganha!");
            }
        }

    }
}
