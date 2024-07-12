/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1848;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1848 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int resultado = 0;
        String frase = "";
        
        for (int i = 0; i < 3; i++) {
            OUTER:
            while (true) {
                frase = t.nextLine();
                if (null != frase) {
                    switch (frase) {
                        case "caw caw":
                            System.out.println(resultado);
                            break OUTER;
                        case "---":
                            resultado+=0;
                            break;
                        case "--*":
                            resultado+=1;
                            break;
                        case "-*-":
                            resultado+=2;
                            break;
                        case "-**":
                            resultado+=3;
                            break;
                        case "*--":
                            resultado+=4;
                            break;
                        case "*-*":
                            resultado+=5;
                            break;
                        case "**-":
                            resultado+=6;
                            break;
                        case "***":
                            resultado+=7;
                            break;
                        default:
                            break;
                    }
                }
            }
            frase = "";
            resultado = 0;
        }
        
    }
}
