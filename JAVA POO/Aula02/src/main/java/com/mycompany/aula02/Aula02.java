/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author n
 */
public class Aula02 {

    public static void main(String[] args) {
      Caneta c1 = new  Caneta ();
      c1.modelo = "BIC";
      c1.cor = "azul";
      c1.ponta = 0.5f;
      c1.tampada = false ;
      c1.carga = 80 ;
      c1.status();
      c1.rabiscar();
      
      
      Caneta c2 = new Caneta ();
      c2.modelo = "cis";
      c2.cor = "Roxo";
      c2.ponta = 0.7f;
      c2.tampar();
      c2.status();
      c2.rabiscar();
    }
}
