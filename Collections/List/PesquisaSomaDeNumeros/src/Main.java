//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SomaNumeros number = new SomaNumeros();

        number.adicionarNumero(1);
        number.adicionarNumero(2);
        number.adicionarNumero(3);

        System.out.println(number.exibirNumeros());
        System.out.println(number.calcularSoma());
        System.out.println(number.encontrarMaiorNumero());
        System.out.println(number.encontrarMenorNumero());
    }
}