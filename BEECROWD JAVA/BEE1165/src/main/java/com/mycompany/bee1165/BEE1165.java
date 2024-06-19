/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1165;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1165 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int casos = t.nextInt();
        for (int c = 0; c < casos;c++){
            int valor = t.nextInt();
            int cont = 0;
            for (int d = 1;d <=valor;d++){
                if (valor % d == 0){
                    cont+=1;
                }
            }
            System.out.println((cont == 2)? valor + " eh primo": valor +" nao eh primo");
        }
    }
}
