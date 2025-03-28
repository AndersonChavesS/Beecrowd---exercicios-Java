import java.util.Scanner;

public class BEE1011 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        double Vol, raio;
        final double Pi = 3.14159;
        double constForm = 4.0 / 3.0;
        // Entrada
        raio = teclado.nextDouble();
        // Processamento
        Vol = (constForm) * Pi * Math.pow(raio,3);
        // Saída
        System.out.printf("VOLUME = %.3f\n", Vol);
        teclado.close();        
    }
}