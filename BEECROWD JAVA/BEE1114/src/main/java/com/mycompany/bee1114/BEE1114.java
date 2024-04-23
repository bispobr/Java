/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1114;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1114 {

    public static void main(String[] args) {
       Scanner t = new Scanner (System.in);
       
       while (true){
           int senha = t.nextInt();
           if (senha == 2002){
               System.out.println("Acesso Permitido");
               break;
           }
           System.out.println("Senha Invalida");
       }
    }
}
