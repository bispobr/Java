/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1329;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1329 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        while (true){
            int n = t.nextInt();
            if (n==0){
                break;
            }
            int jogadas [] = new int [n];
            for(int c = 0;c<n;c++){
                jogadas[c]= t.nextInt();
            }
            int maria = 0;
            int joao = 0;      
            for(int c = 0;c<n;c++){
                
                if (jogadas[c]==0){
                    maria+=1;
                } else if (jogadas[c]==1){
                    joao+=1;
                }
            }
            System.out.println("Mary won "+ maria +" times and John won "+ joao +" times");
                    
        }
        
        
    }
}
