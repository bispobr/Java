/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1632;

import java.util.Scanner;

/**
 *
 * @author bruno
 * #corrigir resultado
 */
public class BEE1632 {
    
    public static boolean caractereVetor(String[] array, char character) {
        for (String str : array) {
            if (str.indexOf(character) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
         
         String vogais[] = {"A", "E", "I", "O", "S", "a", "e", "i", "o", "s"};

        int n = t.nextInt();
        
         for (int i = 0; i < n; i++) {
             String senha = t.next();
             int total = 1;
             for (int j = 0; j < senha.length(); j++) {
                 if (caractereVetor(vogais,senha.charAt(j))) {
                     total *= 3;
                 } else{
                     total *= 2;
                 }
             }
             System.out.println(total);
         }
    }
}
