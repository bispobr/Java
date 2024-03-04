/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1012;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t =  new Scanner (System.in);
        float a = t.nextFloat();
        float b = t.nextFloat();
        float c = t.nextFloat();
        System.out.println("");
        
        System.out.println("TRIANGULO: " + String.format("%.3f", (a * c)/2));
        System.out.println("CIRCULO: " + String.format("%.3f",3.14159 * Math.pow(c, 2) ));
        System.out.println("TRAPEZIO: " + String.format("%.3f",((a + b) / 2)*c  ));
        System.out.println("QUADRADO: " + String.format("%.3f",Math.pow(b, 2)));
        System.out.println("RETANGULO: " + String.format("%.3f",a * b ));
        
      
      
      t.close();
        
    }
}
