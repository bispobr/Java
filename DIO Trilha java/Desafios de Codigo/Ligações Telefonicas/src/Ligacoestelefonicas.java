import java.util.Scanner;

public class Ligacoestelefonicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine().trim());
            double totalCredito = 0.0;

            for (int i = 0; i < n; i++) {
                String[] dadosLigacao = scanner.nextLine().trim().split(",");
                int duracao = Integer.parseInt(dadosLigacao[0].trim());
                String tipoLigacao = dadosLigacao[1].trim();
                double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());
                totalCredito += duracao * valorPorMinuto;
            }

            System.out.printf("%.2f%n", totalCredito);
        }


        scanner.close();
    }    
}
