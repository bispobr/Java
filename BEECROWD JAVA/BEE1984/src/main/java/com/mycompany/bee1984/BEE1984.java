/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1984;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1984 {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        String frase = t.nextLine();
        
        for (int i = (frase.length() - 1); i >= 0; i--) {
            System.out.printf("%s",frase.charAt(i));
        } 
        System.out.println();
    }
}
