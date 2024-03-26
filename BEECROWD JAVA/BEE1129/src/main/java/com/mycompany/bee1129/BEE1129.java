/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1129;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1129 {

    public static void main(String[] args) {
        Scanner t =  new Scanner (System.in);
        int questoes[] = new int [5];
        while (true){
            int n = t.nextInt();
            if (n==0){
                break;
            }
        for (int c = 1; c <=n;c++){
            
            for(int d = 0;d<=4;d++){
                questoes[d] = t.nextInt();
            }
            
            int cont = 0;
            for(int e = 0;e<=4;e++){
                if (questoes[e] <=20){
                    cont = cont + 1;
                }
            }
            
            if (cont > 1){
                System.out.println("*");
            } else{
                if ( questoes[0] <= 127){
                System.out.println("A");
            } else if (questoes[1] <= 127){
                System.out.println("B");
            } else if (questoes[2] <= 127){
                System.out.println("C");
            }else if (questoes[3] <= 127){
                System.out.println("D");
            }else if (questoes[4] <= 127){
                System.out.println("E");
            }
                
            }
        }
        }
        
        
      
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
