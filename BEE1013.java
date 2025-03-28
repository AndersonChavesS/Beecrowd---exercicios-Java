import java.util.Scanner;

public class BEE1013 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, maiorAB, maior;
        // Entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        // Processamento
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        // Saída
        System.out.println(maior + " eh o maior");
        teclado.close();
    }
}