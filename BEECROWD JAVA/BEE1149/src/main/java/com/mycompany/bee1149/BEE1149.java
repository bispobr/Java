/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1149;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1149 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       
       int a = t.nextInt();
       int n = t.nextInt();
       
       while (true){
            
            if (n > 0){
                break;
            }
            
            n = t.nextInt();
       }
       
       int sum = 0;
       for (int c =0; c < n;c++){
           sum += c + a;
       }
       
        System.out.println(sum);
       
    }
}
