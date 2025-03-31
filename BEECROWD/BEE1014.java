import java.util.Scanner;

public class BEE1014 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int X;
        float Y;
        double consumoMedio;
        // Entrada
        X = teclado.nextInt();
        Y = teclado.nextFloat();
        // Processamento
        consumoMedio = X / Y;
        // Saída
        System.out.printf("%.3f km/l\n",consumoMedio );
        teclado.close();
    }
}