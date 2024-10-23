/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2189;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2189 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int teste = 1;
        while (true) {
            int n = t.nextInt();

            if (n == 0) {
                break;
            }

            int valores[] = new int[n];

            System.out.println("Teste " + teste);
            teste += 1;

            for (int i = 0; i < n; i++) {
                valores[i] = t.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (valores[i] == i + 1) {
                    System.out.println(valores[i]);
                    System.out.println();
                    break;
                }
            }

        }
    }
}
