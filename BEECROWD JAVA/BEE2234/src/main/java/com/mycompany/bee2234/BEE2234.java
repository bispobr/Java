/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2234;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2234 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int b = t.nextInt();

        System.out.printf("%.2f\n", (double) a / b);
    }
}
