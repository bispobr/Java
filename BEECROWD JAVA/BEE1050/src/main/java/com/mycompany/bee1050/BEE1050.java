/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1050;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1050 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int ddd = t.nextInt();
       
        switch (ddd){
            case 61 :
                System.out.println("Brasilia");
            break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11 : 
                System.out.println("Sao Paulo");
                 break;
            case 21 :
                System.out.println("Rio de janeiro");
                break;
            case 32 :
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
                break;
        }
        
       
    }
}
