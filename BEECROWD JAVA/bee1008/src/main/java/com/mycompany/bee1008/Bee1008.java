/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1008;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t =  new Scanner (System.in);
        int number = t.nextInt();
        int hora = t.nextInt();
        double valorOra = t.nextDouble();
        double salario = hora * valorOra;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
