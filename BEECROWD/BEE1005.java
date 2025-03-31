import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A, B, MEDIA;
        // Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        // Processamento
        MEDIA = (A * 3.5 + B * 7.5) / 11;
        // Saída
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        teclado.close();
    }
}