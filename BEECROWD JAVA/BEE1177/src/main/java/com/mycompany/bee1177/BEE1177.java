/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1177;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1177 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n [] = new int [1000];
        int pos = 0;
        
        int valor = t.nextInt();
     
        for (int c = 0;c < 1000;c++){
            
                for (int d = 0; d <valor;d++){
                    if (pos == 1000){
                        break;
                    }
                    n[pos] = d;
                    pos +=1;
              
                }
            
            
            System.out.println("N["+c+"] = " + n[c]); 
            
        }
        
    }
}
