/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02exercicio01;

/**
 *
 * @author n
 */
public class Aula02Exercicio01 {

    public static void main(String[] args) {
        Celular n1 = new Celular ();
        n1.bateria = 1;
        n1.cor = "Azul";
        n1.ligado = false;
        n1.memoria = 4096;
        n1.processador = "m2";
        n1.tela = 8.2f;   
        n1.status();
        n1.ligar();
        n1.fazerchamada();
    }
        
}
