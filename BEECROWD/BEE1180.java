import java.util.Scanner;


public class BEE1180 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        if (N < 1 || N > 1000) {
            System.out.println("O valor esta fora do intevalo válido. Valor válido esta entre 1 e 1000");
            return;
        }

        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = teclado.nextInt();
        }

        int menorValor = 999999999;
        int posicao = 0;

        for (int i = 1; i < N; i++) {
            if (X[i] < menorValor) {
                menorValor = X[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
        teclado.close();
    }
}
