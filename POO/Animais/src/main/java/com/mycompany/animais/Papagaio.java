/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Papagaio extends Ave {
    private String Vocabulario;
    //construtor
    public Papagaio(String nome, String classe, String vocabulario) {
        super(nome, classe);
        this.Vocabulario = vocabulario;
    }

    //gettes e setters
    public String getVocabulario() {
        return Vocabulario;
    }

    public void setVocabulario(String Vocabulario) {
        this.Vocabulario = Vocabulario;
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
    
    @Override
    public void falar(){
        System.out.println("Papagaio falando!!!");
    }
    
  
    
    
    
    
}
