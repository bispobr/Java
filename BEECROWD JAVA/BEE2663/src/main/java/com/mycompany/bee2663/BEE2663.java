/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2663;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2663 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        int k = t.nextInt();
        
        int competidor[] = new int [n];
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            competidor[i] = t.nextInt();
        }
        
        Arrays.sort(competidor);
       
       for (int i = 0; i < competidor.length / 2; i++) {
            int temp = competidor[i];
           competidor[i] = competidor[competidor.length - 1 - i];
            competidor[competidor.length - 1 - i] = temp;
        }
     
        for (int i = k; i < n; i++) {
             if (competidor[i]== competidor[k - 1]) {
                cont ++;
            }
        }
        
        System.out.println(k + cont);
        
    }
}
