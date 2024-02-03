/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula09;

/**
 *
 * @author n
 */
public class Aula09 {

    public static void main(String[] args) {
       Pessoa p[] = new Pessoa [4];
       Livro l[] = new Livro[4];
       p[0] = new Pessoa("Lucas",22,"masculino");
       l[0] = new Livro("livro1","autorLivro1",500,0,false,p[0]);
       p[0].fazerAniversario();
       
        System.out.println(l[0].Detalhes());
        System.out.println(p[0].detalhes());
    }
}
