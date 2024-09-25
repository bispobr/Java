/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2686;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2686 {

    public static void hora(float graus) {
        int horas = (int) (graus / 15) + 6;
        if (horas == 24) {
            horas = 0;
        } else if (horas > 24) {
            horas = horas - 24;
        }
        int minutos = (int) ((graus % 15) * 4);
        int segundos = (int) (((graus % 15) * 4 - minutos) * 60);
        
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            float entrada = sc.nextFloat();

            if (entrada == 360) {
                System.out.println("Bom Dia!!");
            }
            if (entrada >= 0 & entrada < 90) {
                System.out.println("Bom Dia!!");
            } else if (entrada >= 90 & entrada < 180) {
                System.out.println("Boa Tarde!!");
            } else if (entrada >= 180 & entrada < 270) {
                System.out.println("Boa Noite!!");
            } else if (entrada >= 270 & entrada < 360) {
                System.out.println("De Madrugada!!");
            }
            
            hora(entrada);
        }

        sc.close();
    }
}
