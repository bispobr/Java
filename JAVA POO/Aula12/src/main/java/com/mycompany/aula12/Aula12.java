/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12;

/**
 *
 * @author n
 */
public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Cachorro k = new Cachorro();
        Camguru c = new Camguru();
        
        System.out.println("Mamifero");
        m.setPeso(50.3f);
        m.setIdade(2);
        m.setMenbros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("------------------------");
        
        System.out.println("Peixe");
        p.setPeso(5.3f);
        p.setIdade(8);
        p.setMenbros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolhas();
        System.out.println("------------------------");
        
        System.out.println("Ave");
        a.setPeso(2.3f);
        a.setIdade(5);
        a.setMenbros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        System.out.println("------------------------");
        System.out.println("camguru");
        c.setPeso(88.3f);
        c.setIdade(33);
        c.setMenbros(2);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usaBolsa();
        System.out.println("------------------------");
        System.out.println("cachoro");
        k.setPeso(448.3f);
        k.setIdade(333);
        k.setMenbros(2);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("------------------------");
    }
}
