/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1089;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1089 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        while (true){
            int n = t.nextInt();
            if (n == 0){
                break;
            }
            int amostra [] = new int [n];
            for(int c = 0;c<n;c++){
                amostra[c]= t.nextInt();
            }
            
           int pico = 0;
           
           for (int c = 0;c<n;c++){
              int proximo = amostra[(c + 1) % n];
              int anterior = amostra[((c -1) + n) % n];
              
              if ((amostra[c] < proximo & amostra[c] < anterior) || (amostra[c] > proximo & amostra[c] > anterior)){
                  pico +=1;
              }
           }
            System.out.println(pico);
               
        }
        
        
        
        
        
        
        
        
    }
}
