import java.util.Scanner;

public class LimiteDeDados {
     public static int gbParaMb(double gb) {
        return (int)(gb * 1024);
    }

    public static void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        int limiteMb = gbParaMb(limiteGb);

        if (consumoTotalMb > limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        double limiteGb = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.println("");

        int consumoTotalMb = scanner.nextInt();
        verificarLimiteDeDados(limiteGb, consumoTotalMb);


        scanner.close();
    }
}
