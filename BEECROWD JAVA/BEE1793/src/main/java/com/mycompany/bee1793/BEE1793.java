/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1793;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1793 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        while (true) {
            int n = t.nextInt();

            if (n == 0) {
                break;
            }

            int tempoPessoas[] = new int[n];

            for (int i = 0; i < n; i++) {
                tempoPessoas[i] = t.nextInt();
            }
            int tempoTotal = 10;

            if (n == 1) {
                System.out.println(tempoTotal);

            } else {

                for (int i = 0; i < n - 1; i++) {
                    tempoTotal += Math.min(10, tempoPessoas[i + 1] - tempoPessoas[i]);
                }
                System.out.println(tempoTotal);
            }

        }

    }
}
