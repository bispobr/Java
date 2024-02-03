/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03;

/**
 *
 * @author n
 */
public class Aula03 {

   public static void main(String[] args) {
      Caneta c1 = new  Caneta ();
      c1.modelo = "CIS";
      c1.cor = "Vermelho";
      //c1.ponta = 0.5f;
      c1.carga = 80;
      //c1.tampada = true;
      c1.status();
      c1.destampar();
      c1.rabiscar();
   
    }
}
