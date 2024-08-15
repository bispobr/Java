/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author n
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void Abrirmenu() {
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Esta tocnado? "+this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int c=0;c<=this.getVolume();c+=10){
            System.out.print("|");
        }   
    }

    @Override
    public void fechamenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 3);
        }
    }

    @Override
    public void menosVolume() {
      if (this.getLigado()){
          this.setVolume(this.getVolume() - 3);    
      }  
    }

    @Override
    public void ligarMudo() {
       if(this.getLigado() && this.getVolume() > 0){
           this.setVolume(0);   
       } 
    }

    @Override
    public void desligaMudo() {
      if (this.getLigado() && this.getVolume() == 0){
          this.setVolume(50);
      }  
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
       if (this.getLigado() && this.getTocando()){
           this.setTocando(false);
       } 
    }
    
    
}
