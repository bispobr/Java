package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate nascmento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascmento = nascmento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascmento, LocalDateTime.now());
    }

    public boolean maiorDeIdade(){
        return getIdade() >= 18;
    }
}
