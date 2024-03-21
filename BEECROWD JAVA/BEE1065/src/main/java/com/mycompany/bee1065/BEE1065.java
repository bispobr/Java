/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1065;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1065 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       int c;
       int valor;
       int cont = 0 ;
       for (c = 1;c <=5; c++){
           valor = t.nextInt();
           if (valor % 2 == 0){
              cont = cont + 1; 
           }
       }
        System.out.println( cont + " valores pares");
       
    }
}
