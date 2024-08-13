import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner t = new Scanner(System.in);
      
              while (in.ready()) {
                  int N = t.nextInt();
      
                  for (int linha = 0; linha < N; ++i) {
                      for (int coluna = 0; coluna < N; ++j) {
                          if (linha == N / 2 && coluna == N / 2) {
                              System.out.print(4);
                          } else if (N / 3 <= linha && linha < N - N / 3 && N / 3 <= coluna && coluna < N - N / 3) {
                              System.out.print(1);
                          } else if (linha == coluna) {
                              System.out.print(2);
                          } else if (linha == N - 1 - coluna) {
                              System.out.print(3);
                          } else {
                              System.out.print(0);
                          }
                      }
                      System.out.println("");
                  }
                  System.out.println("");
              }
    }
}
