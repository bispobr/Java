/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1044;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1044 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       int a = t.nextInt();
       int b = t.nextInt();
       
       if(b > a){
           if (b % a == 0){
               System.out.println("Sao Multiplos");
           } else{
               System.out.println("Nao sao Multiplos");
           }
               
       } else {
           if (a % b == 0){
               System.out.println("Sao Multiplos");
           } else{
               System.out.println("Nao sao Multiplos");
           }
       }
    }
}
