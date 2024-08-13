/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2161;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2161 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        double resposta;
        if (n == 0) {
            resposta = 3.0;
        } else {
            resposta = 6.0;
            for (int i = 0; i < n - 1; ++i) {
                resposta = 6.0 + 1.0 / resposta;
            }
            resposta = 3.0 + 1.0 / resposta;
        }

        System.out.printf("%.10f\n", resposta);
    }
}
