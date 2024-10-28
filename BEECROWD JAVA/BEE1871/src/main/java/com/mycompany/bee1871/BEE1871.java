/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee1871;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1871 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        while (true) {

            int m = t.nextInt();
            int n = t.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            String soma = String.format("%d", n + m);
            System.out.println(soma.replace("0", ""));

        }
    }
}
