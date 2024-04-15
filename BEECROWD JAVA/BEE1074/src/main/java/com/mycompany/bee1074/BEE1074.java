/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1074;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1074 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
        int QuantidadeValores = t.nextInt();
        for (int c = 0; c < QuantidadeValores;c++){
            int CasoDeTeste = t.nextInt();
            if (CasoDeTeste == 0){
                System.out.println("NULL");
            } else{
                if (CasoDeTeste % 2 ==0){
                    if (CasoDeTeste >0){
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else if (CasoDeTeste % 2 !=0){
                    if (CasoDeTeste > 0){
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
            
        }
    }
}
