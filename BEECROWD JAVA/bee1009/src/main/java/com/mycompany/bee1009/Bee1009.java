/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1009;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();
        double total = (salario) + (vendas *15)/100;
        System.out.printf("TOTAL = R$ %.2f%n",total);
    }
}
