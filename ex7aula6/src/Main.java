//ex7aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);

        // Variáveis contadoras
        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;
        int totalEleitores = 10;

        System.out.println("--- SISTEMA DE VOTAÇÃO ---");
        System.out.println("Opções: 1, 2, 3, 4 (Candidatos) | 5 (Nulo) | 6 (Branco)");


        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Eleitor " + i + ", digite seu voto: ");
            int voto = e.nextInt();


            switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Voto inválido e desconsiderado.");
                    break;
            }
        }


        double percBrancosNulos = ((double)(brancos + nulos) / totalEleitores) * 100;


        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Candidato 1: " + cand1 + " votos");
        System.out.println("Candidato 2: " + cand2 + " votos");
        System.out.println("Candidato 3: " + cand3 + " votos");
        System.out.println("Candidato 4: " + cand4 + " votos");
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos em Branco: " + brancos);
        System.out.println("Percentual de Brancos e Nulos: " + percBrancosNulos + "%");

        e.close();
    }
}
