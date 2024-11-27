package models;
import  java.util.List;
import java.util.ArrayList;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
        this.nome = "Center-Banck";
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nomeInstituicao='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
