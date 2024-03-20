/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1060;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1060 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        int cont = 0;
        for (int c = 1;c<=6;c++){
            float valor = t.nextFloat();
            if (valor > 0){
                 cont+=1;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
