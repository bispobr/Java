/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author n
 */
public class Professor extends Pessoa {
    private String especicalidade;
    private float salario;
    
    //gettes e setters

    public String getEspecicalidade() {
        return especicalidade;
    }

    public void setEspecicalidade(String especicalidade) {
        this.especicalidade = especicalidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //metodos
            
    public void receberAumento(){
        this.setSalario(this.getSalario() + 1000);
    }

   
    
}
