/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05;

/**
 *
 * @author n
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco ();
        cb1.setDono("creuza");
        cb1.despositar(500);
        cb1.sacar(250);
    }
}
