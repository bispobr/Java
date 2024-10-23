/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2342;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2342 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int total = t.nextInt();

        int v1 = t.nextInt();
        String sinal = t.next();
        int v2 = t.nextInt();

        if ("+".equals(sinal)) {
            System.out.println((v1 + v2 <= total) ? "OK" : "OVERFLOW");
        } else if ("*".equals(sinal)) {
            System.out.println((v1 * v2 <= total) ? "OK" : "OVERFLOW");
        }

    }
}
