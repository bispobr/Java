/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1153;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1153 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fatorial = 1;
        
        for (int c = 1; c <= n;c++){
            fatorial*=c;
        }
        
        System.out.println(fatorial);
    }
}
