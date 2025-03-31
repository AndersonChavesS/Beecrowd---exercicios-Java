import java.util.Scanner;

public class BEE1012 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        final double pi = 3.14159;
        // Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        // Processamento
        triangulo = (A * C) / 2;
        circulo   = pi * Math.pow(C, 2);
        trapezio  = (A + B) * C / 2;
        quadrado  = Math.pow(B, 2);
        retangulo = A * B;
        // Saída
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",triangulo,circulo,trapezio,quadrado,retangulo);
        teclado.close();

    }
}