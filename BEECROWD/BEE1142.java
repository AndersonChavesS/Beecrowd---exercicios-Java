import java.util.Scanner;

public class BEE1142{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num = 1 ;
        int linhas = teclado.nextInt();
        if(linhas > 0) {
            for(int cont = 1; cont <= linhas; cont++) {
                System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
                num+=4;
            }
        }
        else{
            return;
        }

        teclado.close();
    }
}