import java.util.Scanner;

public class BEE1006{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A, B, C, MEDIA;
        // Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        // Processamento
        MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        // Saída
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        teclado.close();
    }
}