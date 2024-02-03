/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1006;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t =  new Scanner (System.in);
        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();
        double media = ((a*2)+(b*3)+(c*5))/(2+3+5);
        System.out.printf("MEDIA = %.1f%n",media);
    }
}
