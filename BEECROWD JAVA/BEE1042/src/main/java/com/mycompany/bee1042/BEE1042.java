/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1042;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1042 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
       int a = t.nextInt();
       int b = t.nextInt();
       int c = t.nextInt();
       int v [] = {a,b,c};
       int ve [] = v.clone();
       sort(v);
       
       for(int valor:v){
           System.out.println(valor);
       }
       
        System.out.println();
        
       for (int valor:ve){
           System.out.println(valor);
    }
       
       
      
       
                
    }
}
