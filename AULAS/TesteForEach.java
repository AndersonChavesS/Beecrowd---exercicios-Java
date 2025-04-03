import java.util.Scanner;

public class TesteForEach{
    public static void main(String args[]){
        int vetor[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        // leitura
        for (int i=0; i<vetor.length; i++){
            System.out.println("Digite = ");
            vetor[i] = teclado.nextInt();
        }

        for(int elemento: vetor){
            System.out.println("Elemento do vetor = " + elemento);
        }

        teclado.close();
    }
}