/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula14;

/**
 *
 * @author n
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video Filme;
    
    
    //gettes e setters e construtor

    public Visualizacao(Gafanhoto espectador, Video Filme) {
        this.espectador = espectador;
        this.Filme = Filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.Filme.setViews(this.Filme.getViews() + 1);
    }
    
    

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return Filme;
    }

    public void setFilme(Video Filme) {
        this.Filme = Filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", Filme=" + Filme + '}';
    }
    
    
    //metodos
    public void avaliar(){
        this.Filme.setAvaliacao(5);
    }
    
    public void avaliar (int nota){
         this.Filme.setAvaliacao(nota);
    }
    
   
}
