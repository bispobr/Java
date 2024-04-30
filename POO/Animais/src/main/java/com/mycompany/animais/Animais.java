/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Animais {

    public static void main(String[] args) {
        Ave av1 = new Ave("Ave1", "Ave");
        Mamifero m1 = new Mamifero("mamifero 1","Mamifero",40);
        Bemtevi b1 = new Bemtevi("bentivi 1", "Ave");
        Papagaio p1 = new Papagaio("loro","ave","aeiou");
        Vaca v1 = new Vaca ("mimmi","vaca",20,true);
        Cachorro c1 = new Cachorro("lia","cachoro",40,true);
        
        av1.falar();
        m1.correr();
        System.out.println(b1.toString()); 
    }
}
