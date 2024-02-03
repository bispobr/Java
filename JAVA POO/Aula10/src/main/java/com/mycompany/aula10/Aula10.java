/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10;

/**
 *
 * @author n
 */
public class Aula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        Aluno p2 = new Aluno ();
        Professor p3 = new Professor ();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("informatica");
        p3.setSalario(2000f);
        p4.setSetor("estoque");
        
        System.out.println(p3.toString());
    }
}
