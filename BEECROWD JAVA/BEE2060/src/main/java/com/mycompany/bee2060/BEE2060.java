/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2060;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2060 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int casos = t.nextInt();
        int valores[] = new int[casos];

        for (int i = 0; i < casos; i++) {
            valores[i] = t.nextInt();
        }

        for (int j = 2; j <= 5; j++) {
            int multiplo = 0;
            for (int i = 0; i < casos; i++) {
                if (valores[i] % j == 0) {
                    multiplo += 1;
                }
            }
            System.out.println(multiplo + " Multiplo(s) de " + j);
        }

    }
}
