/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculo;

/**
 *
 * @author bispo
 */
public class Veiculo {

    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("asd-2547",2010,4);
        Onibus o1 = new Onibus("ert-2358",2015,40);
        
        System.out.println(c1.exibirDados());
        System.out.println(o1.exibirDados());
        
    }
}
