import java.util.Scanner;

public class BEE1019 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int N, horas, minutos, segundos;
        // Entrada
        N = teclado.nextInt();
        // Processamento
        horas = N / 3600;
        minutos = (N % 3600) /60;
        segundos = N % 60;
        // Saída
        System.out.println(horas + ":" + minutos + ":" + segundos);
        teclado.close();
    }

}