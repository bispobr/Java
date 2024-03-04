/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1017;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        int tempo = t.nextInt();
        int velocidade = t.nextInt();
        int distancia = velocidade * tempo ;
        double litros = distancia / 12.0;
        System.out.printf("%.3f%n", litros);
    }
}
