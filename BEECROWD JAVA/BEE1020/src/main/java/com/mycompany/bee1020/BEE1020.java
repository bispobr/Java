/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1020;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1020 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int valor = t.nextInt();
        int ano = valor/365;
        valor = valor %365;
        int mes = valor / 30;
        valor = valor % 30;
           
        System.out.println( ano +" ano(s)");
        System.out.println( mes +" mes(es)");
        System.out.println( valor +" dia(s)");
    }
}
