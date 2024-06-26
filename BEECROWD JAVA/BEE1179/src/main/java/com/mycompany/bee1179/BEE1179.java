/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1179;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1179 {

    public static void main(String[] args) {
        Scanner t =  new Scanner(System.in);
        int par[] = new int [5];
        int impar[] = new int [5];
        
        int pos1 = 0;
        int pos2 = 0;
        
        for (int c = 0; c <15;c++ ){
            int valor = t.nextInt();
            
            if(valor % 2 == 0){
                par[pos1] = valor;
                pos1+=1;
            } else {
                impar[pos2] = valor;
                pos2+=1;
            }
            
            if (pos1 == 5){
                for (int d = 0;d <par.length;d++){
                    System.out.printf("par[%d] = %d\n",d,par[d]);
                    
                }
                pos1 = 0;
            } 
            
            if (pos2 == 5){
                for (int e = 0;e <impar.length;e++){
                    System.out.printf("impar[%d] = %d\n",e,impar[e]);
                }
                pos2 = 0;
            }
        }
        
        for (int e = 0;e <pos2;e++){
                System.out.printf("impar[%d] = %d\n",e,impar[e]);
        }
        
        for (int d = 0;d <pos1;d++){
                 System.out.printf("par[%d] = %d\n",d,par[d]);
        }
    }
}
