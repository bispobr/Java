/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1043;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1043 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        float a = t.nextFloat();
        float b = t.nextFloat();
        float c = t.nextFloat();
        if(a < b + c && b < a + c && c < a + b){
           float p = a + b + c;
           System.out.println("Perimetro = " + String.format("%.1f", p));
        } else{
            float ar = ((a + b)*c)/2;
            System.out.println("Area = " + String.format("%.1f", ar));
        }
        
    }
}
