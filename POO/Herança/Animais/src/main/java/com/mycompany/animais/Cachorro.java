/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Cachorro extends Mamifero {
    private boolean tipoLatido;

    //construtor
    public Cachorro(String nome, String classe, int velocidade, boolean tipolatido) {
        super(nome, classe, velocidade);
        this.tipoLatido = tipolatido;
    }
    
    //getters e setters

    public boolean isTipoLatido() {
        return tipoLatido;
    }

    public void setTipoLatido(boolean tipoLatido) {
        this.tipoLatido = tipoLatido;
    }

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    //metodos
    
    public void setlateAlto(){
        if (this.tipoLatido == true){
            System.out.println("Cachoro latindo Alto");
        } else {
            System.out.println("Cachoro não pode latir!!");
        }
    }
    
    public void setlateBaixo(){
        if (this.tipoLatido == true){
            System.out.println("Cachoro latindo Baixo");
        } else {
            System.out.println("Cachoro não pode latir!!");
        }
    }
    
    @Override
    public void falar(){
        System.out.println("Cachoro latindo Descontroladamente!!!");
    }
    
}
