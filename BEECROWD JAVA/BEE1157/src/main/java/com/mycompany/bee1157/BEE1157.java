/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1157;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1157 {

    public static void main(String[] args) {
         Scanner t =  new Scanner (System.in);
         
         int n = t.nextInt();
         
         for (int c = 1;c <=n;c++){
             if (n % c == 0){
                 System.out.println(c);
             }
         }
    }
}
