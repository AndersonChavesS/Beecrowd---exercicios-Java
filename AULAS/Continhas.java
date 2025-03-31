public class Continhas{
    public static void main(String args[]){
        int a,b,c;
        float d;
        double e;

        a=27;
        b=4;
        c = a+b;
        System.out.println("Valor de c: " + c);
        c = a-b;
        System.out.println("Valor de c: " + c);
        c = a*b;
        System.out.println("Valor de c: " + c);
        c = a/b;
        System.out.println("Valor de c: " + c);
        c = a % b;
        System.out.println("Valor de c: " + c);

        d= 1.0f;
        System.out.println("Valor de d: " + d);

        d = 1.0f/2;
        System.out.println("Valor de d: " + d);
        System.out.printf("Valor de d: %.3f\n", d);
 

        System.out.printf("Mostrando todo mundo: a = %d, b = %d, c = %d, d = %.2f\n", a,b,c,d);
    }
}