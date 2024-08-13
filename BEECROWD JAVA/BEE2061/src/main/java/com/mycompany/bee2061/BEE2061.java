/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bee2061;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2061 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int abas = t.nextInt();
        int acao = t.nextInt();
        
        String fechou = "fechou";
        String clicou = "clicou";

        for (int i = 0; i < acao; i++) {
            String movimento = t.next();

            if (fechou.equals(movimento)) {
                abas += 1;
            } else if (clicou.equals(movimento)) {
                abas -= 1;
            }
        }
        System.out.println(abas);
    }
}
