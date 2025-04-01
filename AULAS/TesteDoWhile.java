import java.util.Scanner;

public class TesteDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, resultado, contador = 1;
        System.out.println("Digite um valor");
        numero = teclado.nextInt();
        System.out.println("TABUADA DO " + numero);

        do{
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }while(contador <= 10);
        teclado.close();
    }
}