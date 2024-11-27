import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Cliente cliente = new Cliente("bia");
        Cliente cliente2 = new Cliente("ana");

        System.out.println("************************************");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente2);
        System.out.println("************************************");
        cc.depositar(5000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.getEmprestimoDisponivel();


    }
}