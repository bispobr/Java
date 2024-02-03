/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1002;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        
        double raio = t.nextDouble();
        double area = 3.14159 * Math.pow(raio,2) ;
        
        System.out.printf( "A=%.4f%n", area);
        
        t.close();
    }
}
