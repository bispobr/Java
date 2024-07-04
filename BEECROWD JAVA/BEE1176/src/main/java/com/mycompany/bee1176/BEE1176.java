/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1176;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE1176 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
       
       int termo = 0;
        
       int casos = t.nextInt();
       
        long fib[] = new long [casos];
       
       for (int c = 0;c <casos;c++){
            int n = t.nextInt();
            
            int ultimo = 1;
            int penultimo = 1;
        
            if (n==0){
                fib[c] = 0;
            }else if (n==1 || n==2){
                fib[c] = 1;
            }else{
                for(int cont =3;cont <=n;cont++){
                    termo = ultimo + penultimo;
                    penultimo = ultimo;
                    ultimo = termo;
                }
                fib[c] = termo;
             }
            System.out.println("Fib("+n+") = "+fib[c]);
            
       }
    }
}
