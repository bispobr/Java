/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 *
 * @author n
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;
    
    // gettes e setters e construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
          this.categoria = "invalido";  
        }else if (this.peso <= 70.3){
          this.categoria = "leve";  
        } else if (this.peso <=83.3){
          this.categoria = "Medio" ; 
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
        
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    //metodos
    public void apresentar(){
        System.out.println("===========================================");
        System.out.println("CHEGOU A HORA!!!!");
        System.out.println("Lutador " + this.getNome()); 
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println("idade: " + this.getIdade());
        System.out.println("Pesando: " + this.getPeso());
         System.out.println("categoria: " + this.categoria);
        System.out.println("ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("===========================================");
    }
    
    public void status(){
        System.out.println("===========================================");
        System.out.println("Lutador " + this.getNome()); 
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("categoria: " + this.categoria);
        System.out.println("===========================================");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderluta(){
      this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empaterLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
}
