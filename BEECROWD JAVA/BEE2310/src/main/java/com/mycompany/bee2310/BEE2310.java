/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2310;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2310 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int stotal = 0, btotal = 0, atotal = 0, s1total = 0, b1total = 0, a1total = 0;

        int valor = t.nextInt();

        for (int i = 0; i < valor; i++) {
            String nome = t.next();

            int S = t.nextInt();
            int B = t.nextInt();
            int A = t.nextInt();

            stotal += S;
            btotal += B;
            atotal += A;

            int S1 = t.nextInt();
            int B1 = t.nextInt();
            int A1 = t.nextInt();

            s1total += S1;
            b1total += B1;
            a1total += A1;
        }
        System.out.printf("Pontos de Saque: %.2f %%.\n", 100.0 * s1total / stotal);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", 100.0 * b1total / btotal);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", 100.0 * a1total / atotal);
    }
}
