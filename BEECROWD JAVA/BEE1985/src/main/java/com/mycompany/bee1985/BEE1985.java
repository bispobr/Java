/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1985;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1985 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);

        double[] precos = { 1.5, 2.5, 3.5, 4.5, 5.5 };

        int N = t.nextInt();
        double total = 0.0;
        for (int i = 0; i < N; ++i) {
            int produto = t.nextInt();
            int qtd = t.nextInt();

            total += qtd * precos[produto - 1001];
        }

        System.out.printf("%.2f\n", total);
    }
}
