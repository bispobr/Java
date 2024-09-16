/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2717;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2717 {

    public static void main(String[] args) {
         Scanner t = new Scanner (System.in);
         
         int minutos = t.nextInt();
         
         int a = t.nextInt();
         int b = t.nextInt();
         String result = (a + b <= minutos) ? "Farei hoje!" : "Deixa para amanha!";
         System.out.println(result);
         
    }
}
