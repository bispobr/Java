package models;

import interfaces.IConta;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }



    public int getNumero() {
        return numero;
    }



    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
            System.out.println(String.format("Saque de %.2f realizado com sucesso.", valor));
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("operação de %.2f realizado.", valor));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

        if (valor >this.saldo){
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println(String.format("Transferência de %.2f para a conta %d realizada com sucesso.", valor, contaDestino.getNumero()));
        }

    }

    @Override
    public void imprimirExtrato() {

    }

    public String getEmprestimoDisponivel(){
        if (saldo <= 1000)
            return "Empréstimo não disponível";
        else if (saldo > 1500 && saldo < 5000)
            return "Empréstimo de ate R$ 5.000 mil disponível";
        else if (saldo > 5000 && saldo < 10000)
            return "Empréstimo de ate R$ 1.0000 mil disponível";
        else
            return " emprestimo de até  20 mil.";

    }

    protected void ImprimeInformacoesClientes() {
        System.out.println("****************************************************");
        System.out.println("********************informações*********************");
        System.out.println();
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println();
        System.out.println("****************************************************");
    }

    protected void verificarEmprestimo(){
        System.out.println(getEmprestimoDisponivel());
    }
}
