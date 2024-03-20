/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bee1061;

import java.util.Scanner;

/**
 *
 * @author bispo
 */
public class BEE1061 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int diaI, horaI,minutoI, segundoI,diaf, horaf,minutof, segundof,tempo,tempo1,tempo2;
        String lixo;
        //--------------
        lixo = t.next();
        diaI = t.nextInt();
        //----------------
        horaI = t.nextInt();
        lixo = t.next();
        minutoI = t.nextInt();
        lixo = t.next();
        segundoI = t.nextInt();
        //----------------
        lixo = t.next();
        diaf = t.nextInt();
        //----------------
        horaf = t.nextInt();
        lixo = t.next();
        minutof = t.nextInt();
        lixo = t.next();
        segundof = t.nextInt();
        //-----------------
        
        tempo1 = (segundoI) + (minutoI * 60) + (horaI *3600 ) + (diaI * 86400);
        tempo2 = (segundof) + (minutof * 60) + (horaf *3600 ) + (diaf * 86400);
        tempo = tempo2 - tempo1;
        
        int dia = tempo / 86400;
        tempo = tempo % 86400;
        int hora = tempo / 3600;
        tempo = tempo % 3600;
        int minuto = tempo /60;
        int segundo = tempo % 60;
        
        
       System.out.println( dia + " dia(s)");
       System.out.println( hora + " hora(s)");
       System.out.println( minuto + " minuto(s)");
       System.out.println( segundo + " segundo(s)");
    }
}
