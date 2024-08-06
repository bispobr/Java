import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = t.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = t.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;

        for(int c = 0;c <contagem;c++){
            System.out.println("Contagem" + c);
        }
	}
}
