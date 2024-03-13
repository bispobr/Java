/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1038;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1038 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        int cod = t.nextInt();
        int qtd = t.nextInt();
        
        switch (cod){
            case 1:
                 float total = (float) (qtd * 4.00);
                System.out.println("Total: R$ " + String.format("%.2f", total) );
                break;
            case 2:
                float total2 = (float) (qtd * 4.50);
                System.out.println("Total: R$ " + String.format("%.2f", total2));
                break;
            case 3:
                float total3 = (float) (qtd * 5.00);
                System.out.println("Total: R$ " + String.format("%.2f", total3));
                break;
            case 4:
                float total4 = (float) (qtd * 2.00);
                System.out.println("Total: R$ " + String.format("%.2f", total4));
                break;
            case 5:
                float total5 = (float) (qtd * 1.50);
                System.out.println("Total: R$ " + String.format("%.2f", total5));
                break;
        }
        
            
        
    }
}
