import java.util.Scanner;

public class TesteWhile{
    public static void main(String ars[]){
        Scanner teclado = new Scanner(System.in);

        int numero, resultado, contador = 1;
        System.out.println("Digite um valor");

        numero = teclado.nextInt();
        System.out.println("TABUADA DO " + numero);

        while(contador <= 10) {
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }



        teclado.close();
    }
}