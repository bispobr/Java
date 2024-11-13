/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2373;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2373 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int n = t.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int l = t.nextInt();
            int c = t.nextInt();
            if (l > c) {
                soma += c;
            }

        }
        System.out.println(soma);
    }
}
