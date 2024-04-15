/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1079;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1079 {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner t = new Scanner (System.in);
       int valor = t.nextInt();
       
       for (int c = 0;c < valor;c++){
         float v1 = t.nextFloat();
         float v2 = t.nextFloat();
         float v3 = t.nextFloat();
         float media = ((v1*2) + (v2 * 3) + (v3 *5))/10;
           System.out.println(String.format("%.1f", media));   
       }
    }
}
