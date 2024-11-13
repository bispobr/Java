/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2712;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author bruno
 */
public class BEE2712 {
     public static String diaDaSemana(String placa) {
        switch (placa.charAt(7)) {
            case '1':
            case '2':
                return "MONDAY";
            case '3':
            case '4':
                return "TUESDAY";
            case '5':
            case '6':
                return "WEDNESDAY";
            case '7':
            case '8':
                return "THURSDAY";
            case '9':
            case '0':
                return "FRIDAY";
        }
         return null;
       
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        Pattern padrao = Pattern.compile("^([A-Z]{3})-([0-9]{4})$");
        int n = t.nextInt();

        for (int i = 0; i < n; i++) {
            String placa = t.next();
            Matcher matcher = padrao.matcher(placa);

            if (matcher.find()) {
                System.out.println(diaDaSemana(placa));

            } else {
                System.out.println("FAILURE");
            }

        }
    }
}
