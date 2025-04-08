import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double area;
        double perimetro;
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        boolean condicaoTriangulo = a + b > c && a + c > b && b + c > a;


        if (condicaoTriangulo) {
            perimetro = a + b + c;

            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            area = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", area);
        }
        teclado.close();
    }
}
