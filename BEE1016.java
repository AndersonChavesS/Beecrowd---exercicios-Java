import java.util.Scanner;

public class BEE1016 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int tempo, distancia;
        // Entrada
        distancia = teclado.nextInt();
        // Processamento
        tempo = distancia * 2;
        // Saída
        System.out.println(tempo + " minutos");
        teclado.close();
    }
}