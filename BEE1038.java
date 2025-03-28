import java.util.Scanner;

public class BEE1038 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int cod, qtd;
        double total = 0.0;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        switch(cod) {
            case 1:
                total = qtd * 4.0;
                break;
            case 2:
                total = qtd * 4.50;
                break;
            case 3:
                total = qtd * 5.00;
                break;
            case 4:
                total = qtd * 2.00;
                break;
            case 5:
                total = qtd * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f\n", total);
        teclado.close();
    }
}