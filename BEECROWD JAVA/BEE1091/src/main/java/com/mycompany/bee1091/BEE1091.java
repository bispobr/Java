/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1091;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1091 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        while (true){
            
        
        int k = t.nextInt();
        if (k == 0){
            break;
        }
        int pontoDivisor [] = new int [2];
        for (int c = 0;c <=1;c++){
            pontoDivisor[c] = t.nextInt();
                    
        }
        for (int d = 0; d< k;d++){
            int x = t.nextInt();
            int y = t.nextInt();
            
            
            if (x > pontoDivisor[0]){
                if (y > pontoDivisor[1]){
                    System.out.println("NE");
                } else if (y < pontoDivisor[1]){
                    System.out.println("SE");
                } else {
                    System.out.println("divisa");
                }
            } else if (x < pontoDivisor[0]){
                if (y > pontoDivisor[1]){
                    System.out.println("NO");
                } else if (y < pontoDivisor[1]){
                    System.out.println("SO");
                } else{
                    System.out.println("divisa");
                }
            } else{
                if (y > pontoDivisor[1]){
                    System.out.println("divisa");
                } else if (y < pontoDivisor[1]){
                    System.out.println("divisa");
                } else{
                    System.out.println("divisa");
                }
            }   
        }
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
    }
}
