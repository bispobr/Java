public class App {
    public static void main(String[] args) throws Exception {
        Telefone t1 = new Telefone(2563, "258696", "comfio", 25.5);
        t1.imprimirDados();

        SemFio s1 = new SemFio(2563, "8569", "Sem Fio", 25.8, 25, 10, 4);
        s1.imprimirDados();
    }
}
