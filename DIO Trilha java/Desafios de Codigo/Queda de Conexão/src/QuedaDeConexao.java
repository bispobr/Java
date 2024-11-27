import java.util.Scanner;

public class QuedaDeConexao {
    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] velocidades = input.split(",");
        String resultado = verificarQuedaConexao(velocidades);

        System.out.println(resultado);
        
        scanner.close();
    }    
}
