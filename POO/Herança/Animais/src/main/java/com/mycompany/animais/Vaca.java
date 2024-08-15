/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author bispo
 */
public class Vaca extends Mamifero {
    private boolean permitirOrdenha;
    //construtor
    public Vaca(String nome, String classe, int velocidade, boolean permitirOrdenha) {
        super(nome, classe, velocidade);
        this.permitirOrdenha = permitirOrdenha;
    }
    
    //gettters e setters

    public boolean isPermitirOrdenha() {
        return permitirOrdenha;
    }

    public void setPermitirOrdenha(boolean permitirOrdenha) {
        this.permitirOrdenha = permitirOrdenha;
    }

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    // metodo
    
    public void ordenhar(){
        if (this.permitirOrdenha == true){
           System.out.println("ordenhando vaca"); 
        } else {
            System.out.println("vaca não pode ser ordenhada");
        }
        
    }
    
    public void falar (){
        System.out.println("vaca Mugindo!!!");
    }
    
}
