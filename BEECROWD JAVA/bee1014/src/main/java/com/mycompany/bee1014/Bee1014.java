/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1014;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Bee1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner (System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        double consumo = x / y;
        System.out.printf("%.3f Km/l%n",consumo);
    }
}
