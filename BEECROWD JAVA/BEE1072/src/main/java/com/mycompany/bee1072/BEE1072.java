/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1072;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1072 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int valor = t.nextInt();
        int dentro = 0;
        int fora = 0;
        for (int c =1; c <= valor;c++){
            int x = t.nextInt();
            if (x >= 10 & x <=20){
                dentro = dentro + 1;
            } else{
                fora = fora + 1;
            }
        }
            
        System.out.println( dentro + " in");
        System.out.println( fora + " out");
    }
}
