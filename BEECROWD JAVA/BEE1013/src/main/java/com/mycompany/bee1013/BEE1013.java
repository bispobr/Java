/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1013;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1013 {
         public static int maior (int a, int b){
            int  m = (a + b + abs(a-b))/2;
             return m;
         }
         
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
       
        int res = maior(c,maior(a,b));
        System.out.println( res + " eh o maior");
    }
}
