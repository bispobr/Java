/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2162;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2162 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int medidas = t.nextInt();
        int alturas[] = new int [medidas];
        
        for (int i = 0; i < medidas; i++) {
            alturas[i] = t.nextInt();
        }
        
        boolean pico = false;
        boolean vale = false;
        boolean padrao = true;
        
        for (int i = 1; i < medidas; i++) {
            
            if (alturas[i] > alturas[i - 1] && !pico) {
                pico = true;
                vale = false;
            } else if (alturas[i] < alturas[i - 1] && !vale){
                vale = true;
                pico = false;
            } else{
                padrao = false;
                break;
            }
        }
        
        System.out.println(padrao? 1 : 0);
    }
}
