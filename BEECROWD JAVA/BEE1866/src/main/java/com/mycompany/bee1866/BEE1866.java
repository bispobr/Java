/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1866;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1866 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        
        int casos = t.nextInt();
        
        for (int i = 0; i < casos; i++) {
          
            
            int valor = t.nextInt();
           
            System.out.println(valor % 2);
           
        }
    }
}
