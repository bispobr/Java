/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1036;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1036 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        float a = t.nextFloat();
        float b = t.nextFloat();
        float c = t.nextFloat();
        
        double delta = (Math.pow(b, 2)) - 4 * a * c;
        
        if(a==0){
            System.out.println("Impossivel calcular");
        }else if (delta < 0){
            System.out.println("Impossivel calcular");
        } else{
             double x1 = (-b+Math.sqrt(delta))/(2*a);
             double x2 = (-b-Math.sqrt(delta))/(2*a);
             
             System.out.println("R1 = " + String.format("%.5f", x1));
             System.out.println("R2 = " + String.format("%.5f", x2));
                    
        }
            
        
        
    }
}
