import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, area, pi = 3.14159;
        // Entrada
        raio = teclado.nextDouble();
        // Processamento
        area = pi * Math.pow(raio, 2);
        // Saída
        System.out.printf("A=%.4f\n", area);
        teclado.close();
    }
}