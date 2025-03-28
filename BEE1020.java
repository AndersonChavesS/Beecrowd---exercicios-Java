import java.util.Scanner;

public class BEE1020 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int idadeEmDias, ano, mes, dia;
        // Entrada
        idadeEmDias = teclado.nextInt();
        // Processamento
        ano = idadeEmDias / 365;
        mes = (idadeEmDias % 365) / 30;
        dia = (idadeEmDias % 365) % 30;
        // Saída
        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");
        teclado.close();
    }
}