/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1150;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1150 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
       
       int x = t.nextInt();
       int z = t.nextInt();
       
       while (x > z){
         z = t.nextInt();
       }
       
       int soma = 0;
       int qtd = 1;
       
       for (int c = x; c <z;c++){
           soma+=c;
           if (soma < z){
               qtd +=1;
           }
       }
       
        System.out.println(qtd);
    }
}
