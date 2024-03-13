/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1047;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1047 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int hI = t.nextInt();
        int mI = t.nextInt();
        int hF = t.nextInt();
        int mF = t.nextInt();
        
        mI = mI + (hI *60);
        mF = mF + (hF * 60); 
        int tempo = mF - mI;
        
        if (tempo <= 0){
            tempo = 24 * 60;     
       }
        
        int horas = tempo /60;
        int minutos = tempo %60;
        System.out.println("O JOGO DUROU "+ horas+ " HORA(S) E "+ minutos +" MINUTO(S)");
              
    }
}
