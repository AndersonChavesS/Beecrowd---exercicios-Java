import java.util.Scanner;

public class TesteVetor{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double notas[];

        notas = new double[5];

        for(int pos=0; pos < 5; pos++){
            System.out.println("Digite a nota do aluno " + (pos+1));
            notas[pos] = teclado.nextDouble();
        }
     
        for(int pos=0; pos < 5; pos++) {
            System.out.printf("Nota do aluno %d = %.2f\n", (pos+1), notas[pos]);
        }
        teclado.close();
    }
}