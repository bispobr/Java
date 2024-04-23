/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee116;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE116 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        int qtdCasos =  t.nextInt();
        for (int c = 0; c < qtdCasos;c++){
            int x = t.nextInt();
            int y =t.nextInt();
            
            if (y == 0){
                System.out.println("divisao impossivel");
            } else{
                System.out.printf("%.1f\n", (double) x / y); 
            }
        }
    }
}
