import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
/*
int a;
float b;
double c;

System.out.println("Por favor, digite um valor inteiro: ");
a = teclado.nextInt();
System.out.println("Voce digitou o valor: " + a);

System.out.println("Por favor, digite um valor float: ");
b = teclado.nextFloat();
System.out.println("Voce digitou o valor: " + b);

System.out.println("Por favor, digite um valor double: ");
c = teclado.nextDouble();

System.out.printf("Voce digitou os valore %.3f\n", c);
*/

String nome;
int    codigo;
double salario;

System.out.println("Por favor, digite o seu codigo: ");
codigo = Integer.parseInt(teclado.nextLine());

System.out.println("Por favor, digite o seu nome: ");
nome = teclado.nextLine();

System.out.println("Por favor, digite o seu salario: ");
salario = Double.parseDouble(teclado.nextLine());

System.out.println("====================================");
System.out.println("Código: " + codigo + "\nNome: " + nome + "\nSalario: R$" + salario);
System.out.println("====================================");

    teclado.close();
    }
}