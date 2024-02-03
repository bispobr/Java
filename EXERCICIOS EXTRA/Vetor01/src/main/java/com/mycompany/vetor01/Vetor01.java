/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor01;

/**
 *
 * @author n
 */
public class Vetor01 {

    public static void main(String[] args) {
        String mes[] = {"jan", "fev","mar","Abril","mai","jun","Ago","Set","Out","nov","Dez"};
        String tot[] = {"31","28","31","30","31","30","31","30","31","31","30","31"};
        
       for (int c = 0; c < mes.length;c++){
           System.out.println("o mes "+mes[c]+" Tem "+tot[c]+ " dias");
       }
       
       for (String valor:tot){
           System.out.println(valor);
       }
    }
}
