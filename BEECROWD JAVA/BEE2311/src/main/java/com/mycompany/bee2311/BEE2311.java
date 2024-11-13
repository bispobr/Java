/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2311;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2311 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        double v[] = new double[7];
        int valor = t.nextInt();

        for (int i = 0; i < valor; i++) {
            String nome = t.next();

            double grau = t.nextDouble();

            double soma = 0;
            double maior = 0;
            double menor = 99999;
            double res = 0;

            for (int j = 0; j < 7; j++) {
                v[j] = t.nextFloat();
                soma += v[j];

                if (v[j] > maior) {
                    maior = v[j];
                }

                if (v[j] < menor) {
                    menor = v[j];
                }

            }

            res = ((soma - maior) - menor) * grau;
            System.out.printf("%s %.2f\n", nome, res);

        }
    }
}
