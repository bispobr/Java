import java.util.Arrays;
import java.util.Scanner;

class Servico {
    private double valor;
    public Servico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class ComboServicos {
    private Servico[] servicos;
    private double desconto1, desconto2, desconto3;
    private double descontoAdicional = 20.00;


    public ComboServicos(Servico[] servicos, double[] descontos) {
        this.servicos = servicos;
        this.desconto1 = descontos[0];
        this.desconto2 = descontos[1];
        this.desconto3 = descontos[2];
    }

    public double calcularValorTotal() {
        int servicosContratados = (int) Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .count();


        double desconto = 0;
        switch (servicosContratados) {
            case 1:
                desconto = desconto1;
                break;
            case 2:
                desconto = desconto2;
                break;
            case 3:
                desconto = desconto3;
                break;
        }

        double valorTotal = Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .mapToDouble(Servico::getValor)
                .sum();

        double valorComDesconto = valorTotal * (1 - desconto / 100);
        
        if (servicosContratados == 3) {
            valorComDesconto -= descontoAdicional;
        }


        return valorComDesconto;
    }
}


public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] entrada1 = scanner.nextLine().trim().split(",");
        double[] valoresServicos = Arrays.stream(entrada1)
                .mapToDouble(Double::parseDouble)
                .toArray();

        String[] entrada2 = scanner.nextLine().trim().split(",");
        double[] descontos = Arrays.stream(entrada2)
                .mapToDouble(Double::parseDouble)
                .toArray();

        Servico[] servicos = new Servico[valoresServicos.length];
        for (int i = 0; i < valoresServicos.length; i++) {
            servicos[i] = new Servico(valoresServicos[i]);
        }

        ComboServicos combo = new ComboServicos(servicos, descontos);

        double valorTotal = combo.calcularValorTotal();
        System.out.printf("%.2f\n", valorTotal);


        scanner.close();
 }
}
