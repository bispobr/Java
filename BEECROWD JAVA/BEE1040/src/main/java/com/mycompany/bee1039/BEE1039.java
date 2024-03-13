/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1039;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1039 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner (System.in);
        float n1 = t.nextFloat();
        float n2 = t.nextFloat();
        float n3 = t.nextFloat();
        float n4 = t.nextFloat();
        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1 )) / 10;
        System.out.println("Media: " + String.format("%.1f", media));
        
        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            float n5 = t.nextFloat();
            System.out.println("Nota do exame: " + n5);
            media = (media + n5) / 2;
            if(media >= 5 ){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", media));
        }
    }
}
