import java.util.Scanner;

public class TesteSwitch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = teclado.nextInt();

        switch(valor) {
            case 1:
                System.out.println("Voce digitou 1");
                break;
            case 2:
                System.out.println("Voce digitou 2");
                break;
            case 3:
                System.out.println("Voce digitou 3");
                break;
            default:
                System.out.println("Voce digitou outro valor");
        }
        teclado.close();
    }
}