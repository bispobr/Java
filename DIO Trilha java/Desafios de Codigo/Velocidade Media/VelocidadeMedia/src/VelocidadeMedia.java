import java.util.Scanner;

public class VelocidadeMedia {
    
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim());
        }

        return (double) total / velocidades.length;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] velocidades = input.split(",");
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        System.out.println((int) velocidadeMedia + " Mbps");
        
        scanner.close();
    }
}
