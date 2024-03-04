/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1019;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1019 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int valor = t.nextInt();
        int horas = valor /3600;
        valor= valor%3600;
        int minutos = valor /60;
        valor=valor%60;      
        System.out.println(horas + ":"+ minutos + ":"+ valor);
    }
}
