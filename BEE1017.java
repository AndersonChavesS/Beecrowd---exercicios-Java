import java.util.Scanner;

public class BEE1017 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int tempoViagem, velocidadeMedia; 
        double combustivelGastoKmL = 12.0;
        double combustivelNecessario;
        // Entrada
        tempoViagem     = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();
        // Processamento
        combustivelNecessario = (tempoViagem * velocidadeMedia) / combustivelGastoKmL;
        // Saída
        System.out.printf("%.3f\n", combustivelNecessario);
        teclado.close();
    }
}