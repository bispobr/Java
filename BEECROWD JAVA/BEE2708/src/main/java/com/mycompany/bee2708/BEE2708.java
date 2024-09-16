/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee2708;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class BEE2708 {

    public static void main(String[] args) {
            Scanner t = new Scanner (System.in);
            int totVisitantes = 0;
            int jipes = 0;
       while(true){
           String status = t.next();
           
           if ("ABEND".equals(status)) {
               break;
           }
           
           int qtdVisitantes = t.nextInt();
           
           if ("SALIDA".equals(status)) {
               totVisitantes += qtdVisitantes;
               jipes += 1;
           } else if("VUELTA".equals(status)){
               totVisitantes -= qtdVisitantes;
               jipes -= 1;
           }
       }
       
        System.out.println(totVisitantes);
        System.out.println(jipes);
    }
}
