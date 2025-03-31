import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int NUMBER, OURSWORK;
        float SALARY, OURSALARY;
        // Entrada
        NUMBER = teclado.nextInt();
        OURSWORK = teclado.nextInt();
        OURSALARY = teclado.nextFloat();
        // Processamento
        SALARY = OURSALARY * OURSWORK;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", NUMBER, SALARY);
        teclado.close();
    }
}