/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1066;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1066 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in); 
       int valor;
       int par = 0;
       int impar = 0; 
       int pos = 0 ;
       int neg = 0;
       for (int c = 1 ; c <=5;c++){
           valor = t.nextInt();
           if(valor % 2 == 0){
               par = par + 1;
           } else{
               impar = impar + 1;
           }
           
           if (valor > 0){
               pos = pos + 1;
           } else if (valor < 0 ){
               neg = neg + 1;
           }
       }
       
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println(  pos + "valor(es) positivo(s)");
        System.out.println(  neg + " valor(es) negativo(s)");
       
       
    }
}
