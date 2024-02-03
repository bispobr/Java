/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1005;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t =  new Scanner (System.in);
        double a = t.nextDouble();
        double b = t.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f",media);
    }
}
