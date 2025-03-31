import java.util.Scanner;

public class TesteIF{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, me;
        System.out.println("Digite a N1:");
        n1 = teclado.nextDouble();
        System.out.println("Digite a N2:");
        n2 = teclado.nextDouble();

        me = (n1 + n2)/2;

        System.out.println("Sua média vale " + me);

        if(n1 >= 5.0 && me >= 6.0) {
            System.out.println("Parabéns!! Aprovado!");
        }
        else{
            System.out.println("Puxa vida, nos vemos na próxima!");
        }

        teclado.close();
    }
}