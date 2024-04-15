/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1078;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1078 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       int valor = t.nextInt();
       for (int c = 1;c <= 10;c++){
           System.out.println(c + " x " + valor + " = " +  c * valor  );
       }
       
       
    }
}
