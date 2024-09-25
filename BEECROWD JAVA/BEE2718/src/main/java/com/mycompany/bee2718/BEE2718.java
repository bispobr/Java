/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2718;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2718 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        for (int i = 0; i < n; i++) {
            int x = t.nextInt();

            int resp = 0;
            int cont = 0;
            while (x > 0) {
                if (x % 2 == 1) {
                    cont += 1;
                } else {
                    resp = Math.max(resp, cont);
                    cont = 0;
                }
                x /= 2;
            }
            resp = Math.max(resp, cont);
            System.out.println(resp);
        }
    }
}
