/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1010;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner t = new Scanner(System.in);
        int cod1 = t.nextInt();
        int qtd1 = t.nextInt();
        float valor1 = t.nextFloat();
        int cod2 = t.nextInt();
        int qtd2 = t.nextInt();
        float valor2 = t.nextFloat();
        float soma = (qtd1 * valor1) + (qtd2 * valor2);
        
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", soma));
        t.close();
    }
}
