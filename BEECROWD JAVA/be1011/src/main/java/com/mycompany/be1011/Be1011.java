/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.be1011;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class Be1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double volume = (4/3.0)*3.14159*Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
