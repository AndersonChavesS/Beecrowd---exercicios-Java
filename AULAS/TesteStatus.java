import java.util.Scanner;

public class TesteStatus{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o status do pedido");
        String status = teclado.nextLine();

        switch(status){
            case "N":
            case "n":
            case "Novo":
            case "novo":
                System.out.println("Status do pedido 102558: Novo");
                break;
            
            case "S":
            case "s":
            case "Separa":
            case "separa":
                System.out.println("Status do pedido 268549: Em separaçao");
                break;
            
            case "F":
            case "f":
            case "Finalizado":
            case "finalizado":
                System.out.println("Status do pedido 452568: Finalizado");
                break;
            

        }



        teclado.close();         
    }
}