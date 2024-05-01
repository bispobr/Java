/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1134;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1134 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int op = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while (op != 4){
            op = t.nextInt();
            
            switch (op){
                case 1:
                    alcool+=1;
                 break;  
                case 2:
                    gasolina+=1;
                 break; 
                case 3:
                    diesel+=1;
                 break; 
            }
            
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
}
