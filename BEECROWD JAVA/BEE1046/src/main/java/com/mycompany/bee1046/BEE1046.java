/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1046;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1046 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int inicio = t.nextInt();
        int fim = t.nextInt();
        int horas = 0;
        if (fim < inicio){
             horas = (fim + 24) - inicio;
        } else if(inicio == fim) {
             horas = 24;
        } else{
             horas = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + horas + " HORA(S)");
    }
}
