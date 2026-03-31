//ex5aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        int aprovado = 0, reprovado=0, exame=0 ;
        double mediaturma = 0;

        int i ;

        for (i=1; i<=6 ; i++){

            System.out.println("Digite a primeira nota do aluno " + i + ":");
            double nota1=e.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + i + ":");
            double nota2=e.nextDouble();

            double media = (nota1 + nota2)/2;

            mediaturma = mediaturma + media;

            if (media<=3){
                System.out.printf("Você está reprovado! Sua nota foi de: %.2f%n%n" , media );
                reprovado++;
            } else if ((media>3)&&(media<7)) {
                System.out.printf("Muito cuidado! Você está em exame. Sua média foi de: %.2f%n%n" , media );
                exame++;
            }else{
                System.out.printf("Parabéns você foi aprovado! Sua nota foi de: %.2f%n%n" , media );
                aprovado++;
            }
        }
        e.close();
        System.out.println("Um total de " + reprovado + " alunos foram reprovados ");
        System.out.println("Um total de " + exame + " alunos ficaram de exame ");
        System.out.println("Um total de " + aprovado + " alunos foram aprovados ");
        System.out.printf("A média da turma foi de %.2f" , mediaturma/6 );
    }
}
