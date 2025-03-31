import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, SOMA;
        // Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        // Processamento
        SOMA = A + B;
        // Saída
        System.out.println("SOMA = " + SOMA);
        teclado.close();
    }
}