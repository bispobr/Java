/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2159;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2159 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        System.out.printf("%.1f %.1f\n", n / Math.log(n), 1.25506 * n / Math.log(n));
    }
}
