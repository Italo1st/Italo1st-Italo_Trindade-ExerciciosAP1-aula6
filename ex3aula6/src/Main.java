//ex3aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner e=new Scanner(System.in);

        int c;

        System.out.println("Escreva um numero: ");
        int i=e.nextInt();

        for (c=1; c<=i; c++){
            System.out.print(c + " ");
        }
    }
}