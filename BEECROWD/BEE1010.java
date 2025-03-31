import java.util.Scanner;

public class BEE1010 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int codigoPecaUm, codigoPecaDois, qtdPecasUm, qtdPecasDois;
        float valorUnitPecaUm, valorUnitPecaDois;
        double valorAPagar;
        // Entrada
        codigoPecaUm = teclado.nextInt();
        qtdPecasUm = teclado.nextInt();
        valorUnitPecaUm = teclado.nextFloat();

        codigoPecaDois = teclado.nextInt();
        qtdPecasDois = teclado.nextInt();
        valorUnitPecaDois = teclado.nextFloat();
        // Processamento
        valorAPagar = (qtdPecasUm * valorUnitPecaUm) + (qtdPecasDois * valorUnitPecaDois);
        // Saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
        teclado.close();
    }
}