import java.util.Scanner;
import java.util.Arrays;

public class BEE1042 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int[] numerosOriginais = new int[3];
        for(int i = 0; i < 3; i++) {
            numerosOriginais[i] = teclado.nextInt();
        }

        int[] numerosOrdenados = Arrays.copyOf(numerosOriginais, 3);
        Arrays.sort(numerosOrdenados);

        for(int num : numerosOrdenados){
            System.out.println(num);
        }

        System.out.println();

        for(int num : numerosOriginais) {
            System.out.println(num);
        }

        teclado.close();
    }
}