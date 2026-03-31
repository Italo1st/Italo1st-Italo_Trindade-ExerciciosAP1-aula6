//ex4aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        double contadorID50 = 0, contadorALT = 0;

        int i ;

        for (i=1;i<=10;i++){

            System.out.println("Escreva a idade da " + i + "° pessoa:");
            double idade = e.nextDouble();

            System.out.println("Escreva a altura da " + i + "° pessoa (em cm) :");
            double altura = e.nextDouble();

            if (idade>=50) {
                contadorALT = contadorALT + altura;
                contadorID50++;
            }

        }
        e.close();

        System.out.printf ("A altura média das pessoas 50+ é de %.2f cm" , (contadorALT/contadorID50));
    }
}