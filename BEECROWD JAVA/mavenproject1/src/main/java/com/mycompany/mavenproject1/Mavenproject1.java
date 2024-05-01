/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
      Scanner t = new Scanner (System.in);
      int n = t.nextInt();
      int inicio = 1;
      for (int c= 0; c <n;c++){
          for (int d = inicio; d < inicio + 3; d++){
              System.out.print(d +" ");
          }
          System.out.println("PUM");
          inicio+=4;
      }
      
    }
}
