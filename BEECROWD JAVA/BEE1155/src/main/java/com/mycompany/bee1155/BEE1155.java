/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1155;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1155 {

    public static void main(String[] args) {
           Scanner t =  new Scanner (System.in);
           double s = 0.0;
           
           for (int c = 1; c <=100;c++){
               s+= 1.0/c;
           }
           
           System.out.printf("%.2f\n", s);
    }
}
