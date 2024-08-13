/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1865;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1865 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int casos = t.nextInt();
        
        for (int i = 0; i < casos; i++) {
            String nome = t.next();
            
            int valor = t.nextInt();
            
            if ("Thor".equals(nome)) {
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}
