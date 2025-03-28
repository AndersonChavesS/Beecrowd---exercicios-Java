import java.util.Scanner;

public class BEE1040 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double N1, N2, N3, N4, Media, notaExame;
    
        N1 = teclado.nextDouble();
        N2 = teclado.nextDouble();
        N3 = teclado.nextDouble();
        N4 = teclado.nextDouble();

        Media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1 ) / 10.0;
        Media = Math.floor(Media * 10.0 + 0.4) / 10.0;
        System.out.printf("Media: %.1f\n", Media);

        if (Media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (Media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            notaExame = teclado.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            double mediaFinal = (notaExame + Media) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");              
            } else {
                System.out.println("Aluno reprovado.");
            }
                System.out.printf("Media final: %.1f\n", mediaFinal);
        }

        teclado.close();
    }
}