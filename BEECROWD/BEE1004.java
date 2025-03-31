import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, PROD;
        // Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        // Processamento
        PROD = A * B;
        // Saída
        System.out.println("PROD = " + PROD);
        teclado.close();
    }
}