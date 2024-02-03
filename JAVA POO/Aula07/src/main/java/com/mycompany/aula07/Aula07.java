/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula07;

/**
 *
 * @author n
 */
public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        
        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,0);
        l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        l[2] = new Lutador("snap","eua",55,1.78f,80.9f,14,2,3);
        l[3] = new Lutador("Dead","Australia",28,1.93f,81.6f,14,0,2);
        
     
        
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0],l[3]);
        //luta1.status();
        luta1.lutar();
        
        
        
       
    }
}
