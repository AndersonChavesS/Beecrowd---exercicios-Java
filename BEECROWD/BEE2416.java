import java.util.Scanner;

public class BEE2416 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int C, N, pontoTermino;

        C = teclado.nextInt();
        N = teclado.nextInt();

        pontoTermino = C % N;
        System.out.println(pontoTermino);
        teclado.close();
    }
}