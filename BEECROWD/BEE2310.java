import java.util.Scanner;

public class BEE2310 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();

        int[] saques = new int[n];
        int[] bloqueios = new int[n];
        int[] ataques = new int[n];
        int[] saquesSucesso = new int[n];
        int[] bloqueiosSucesso = new int[n];
        int[] ataquesSucesso = new int[n];

        int totalSaques = 0, totalBloqueios = 0, totalAtaques = 0;
        int totalSaquesSucesso = 0, totalBloqueiosSucesso = 0, totalAtaquesSucesso = 0;

        for (int i = 0; i < n; i++) {
            String nome = teclado.nextLine();
            saques[i] = teclado.nextInt();
            bloqueios[i] = teclado.nextInt();
            ataques[i] = teclado.nextInt();
            saquesSucesso[i] = teclado.nextInt();
            bloqueiosSucesso[i] = teclado.nextInt();
            ataquesSucesso[i] = teclado.nextInt();
            teclado.nextLine();

            totalSaques += saques[i];
            totalBloqueios += bloqueios[i];
            totalAtaques += ataques[i];
            totalSaquesSucesso += saquesSucesso[i];
            totalBloqueiosSucesso += bloqueiosSucesso[i];
            totalAtaquesSucesso += ataquesSucesso[i];
        }

        double percentualSaques = (totalSaquesSucesso * 100.0) / totalSaques;
        double percentualBloqueios = (totalBloqueiosSucesso * 100.0) / totalBloqueios;
        double percentualAtaques = (totalAtaquesSucesso * 100.0) / totalAtaques;

        System.out.printf("Pontos de Saque: %.2f %%.\n", percentualSaques);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", percentualBloqueios);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", percentualAtaques);

        teclado.close();
    }
}