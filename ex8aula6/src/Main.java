//ex8aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);


        int pessoasMais50 = 0;

        double somaAlturas10a20 = 0;
        int contAlturas10a20 = 0;

        int pessoasPesoBaixo = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Dados da pessoa " + i + " ---");

            System.out.print("Idade: ");
            int idade = e.nextInt();

            System.out.print("Altura (ex: 1,75): ");
            double altura = e.nextDouble();

            System.out.print("Peso (kg): ");
            double peso = e.nextDouble();


            if (idade > 50) {
                pessoasMais50++;
            }


            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contAlturas10a20++;
            }


            if (peso < 40) {
                pessoasPesoBaixo++;
            }

            System.out.println();
        }




        double mediaAlturas = (contAlturas10a20 > 0) ? (somaAlturas10a20 / contAlturas10a20) : 0;


        double porcentagemPeso = ((double) pessoasPesoBaixo / 10) * 100;


        System.out.println("------- RESULTADOS -------");
        System.out.println("Pessoas com mais de 50 anos: " + pessoasMais50);

        if (contAlturas10a20 > 0) {
            System.out.printf("Média das alturas (10 a 20 anos): %.2fm\n", mediaAlturas);
        } else {
            System.out.println("Média das alturas (10 a 20 anos): Nenhuma pessoa nesta faixa.");
        }

        System.out.println("Porcentagem de pessoas com peso < 40kg: " + porcentagemPeso + "%");

        e.close();
    }
}