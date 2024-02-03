/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula11;

/**
 *
 * @author n
 */
public class Aula11 {

    public static void main(String[] args) {
        
       // Pessoa p1 = new Pessoa();
       Visitante v1 = new Visitante();
       v1.setNome("lucas");
       v1.setIdade(55);
       v1.setSexo("Feminino");
       
       System.out.println(v1.toString());
       
       Aluno a1 = new Aluno();
       
       a1.setNome("leandro");
       a1.setIdade(18);
       a1.setSexo("nãobinario");
       
       System.out.println(a1.toString());
       
        a1.pagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       
       b1.setNome("gabriela");
       b1.setIdade(33);
       b1.setSexo("homen cis");
      
       System.out.println(b1.toString());
       
        b1.pagarMensalidade();
    }
}
