/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2166;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2166 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        
         double resposta;
        if (n == 0) {
            resposta = 1.0;
        } else {
            resposta = 2.0;
            for (int i = 0; i < n - 1; ++i) {
                resposta = 2.0 + 1.0 / resposta;
            }
            resposta = 1.0 + 1.0 / resposta;
        }

        System.out.printf("%.10f\n", resposta);
    }
}
