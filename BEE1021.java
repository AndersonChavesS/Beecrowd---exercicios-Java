import java.util.Scanner;

public class BEE1021 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double valor;
        int resto, C100, C50, C20, C10, C5, C2, M1, M050, M025, M010, M005, M001;

        valor = teclado.nextDouble();
        // Converte o valor para centavos
        resto = (int) Math.round(valor * 100);

        // Cálculo das notas
        C100 = resto / 10000;
        resto %= 10000;

        C50 = resto / 5000;
        resto %= 5000;

        C20 = resto / 2000;
        resto %= 2000;

        C10 = resto / 1000;
        resto %= 1000;

        C5 = resto / 500;
        resto %= 500;

        C2 = resto / 200;
        resto %= 200;

        // Cálculo das moedas
        M1 = resto / 100;
        resto %= 100;

        M050 = resto / 50;
        resto %= 50;

        M025 = resto / 25;
        resto %= 25;

        M010 = resto / 10;
        resto %= 10;

        M005 = resto / 5;
        resto %= 5;

        M001 = resto;
      
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", C100);
        System.out.printf("%d nota(s) de R$ 50.00\n", C50);
        System.out.printf("%d nota(s) de R$ 20.00\n", C20);
        System.out.printf("%d nota(s) de R$ 10.00\n", C10);
        System.out.printf("%d nota(s) de R$ 5.00\n", C5);
        System.out.printf("%d nota(s) de R$ 2.00\n", C2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", M1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", M050);
        System.out.printf("%d moeda(s) de R$ 0.25\n", M025);
        System.out.printf("%d moeda(s) de R$ 0.10\n", M010);
        System.out.printf("%d moeda(s) de R$ 0.05\n", M005);
        System.out.printf("%d moeda(s) de R$ 0.01\n", M001);

        teclado.close();
    }
}