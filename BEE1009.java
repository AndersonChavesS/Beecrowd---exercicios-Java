import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo, vendasEfetuadas, comissao = 0.15, total;
        // Entrada
        nomeVendedor = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        vendasEfetuadas = teclado.nextDouble();
        // Processamento
        total = salarioFixo + (vendasEfetuadas * comissao);
        // Saída
        System.out.printf("TOTAL = R$ %.2f\n", total);
        teclado.close();
    }
}