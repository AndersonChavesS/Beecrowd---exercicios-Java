import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;
        // Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        // Processamento
        DIFERENCA = (A * B - C * D);
        // Saída
        System.out.println("DIFERENCA = " + DIFERENCA);
        teclado.close();
    }
}