/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1099;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1099 {

    public static void main(String[] args) {
        Scanner t= new Scanner (System.in);
       int qtdCasos = t.nextInt();
       int x,y;
       for (int c = 0;c<qtdCasos;c++){
          x = t.nextInt();
          y= t.nextInt();
          int soma= 0;  
          if (x == y){
              System.out.println("0");
          } else if (x > y){
              for (int d = y +1 ; d < x ; d++){
                  if (d % 2 !=0){
                    soma+=d;  
                  }
              }
              System.out.println(soma);
          } else if (y > x){
              for (int e = x +1 ; e < y ; e++){
                  if (e % 2 !=0){
                    soma+=e;  
                  }
              }
              System.out.println(soma);
              
              
          }
          
       }
    }
}
