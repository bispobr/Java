/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1035;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1035 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        int d = t.nextInt();
       
        if (b>c &&  d > a && ((c + d)> (a + b)) && c > 0 && d > 0 && (a % 2 == 0)){
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceitos");
        }
        
        
    }
}
