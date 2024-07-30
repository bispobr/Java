import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        
        Scanner t = new Scanner(System.in);

        System.out.println("Por favor, digite o número");
        int numero = t.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = t.next();

        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = t.next();

        System.out.println("Por favor, digite o Saldo");
        double saldo = t.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero+ " e seu saldo "+ saldo +" já está disponível para saque");


    }
}
