/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1789;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1789 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int maior = 0;

        while (t.hasNextLine()) {
            int l = t.nextInt();

            for (int i = 0; i < l; i++) {
                int valor = t.nextInt();

                if (valor > maior) {
                    maior = valor;
                }
            }

            if (maior >= 20) {
                System.out.println(3);
            } else if (maior >= 10) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
             maior = 0;
        }

    }
}
