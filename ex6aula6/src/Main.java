//Ex6aula6 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);


        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;
        int totalEleitores = 10;

        System.out.println("--- Sistema de Votação ---");
        System.out.println("Opções: 1, 2, 3, 4 (Candidatos) | 5 (Nulo) | 6 (Branco)");


        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Eleitor " + i + ", digite seu voto: ");
            int voto = e.nextInt();


            if (voto == 1) {
                cand1++;
            } else if (voto == 2) {
                cand2++;
            } else if (voto == 3) {
                cand3++;
            } else if (voto == 4) {
                cand4++;
            } else if (voto == 5) {
                nulos++;
            } else if (voto == 6) {
                brancos++;
            } else {
                System.out.println("Voto inválido (não contabilizado).");
            }
        }


        double percentualBrancos = (brancos * 100.0) / totalEleitores;
        double percentualNulos = (nulos * 100.0) / totalEleitores;


        System.out.println("\n--- Resultado da Eleição ---");
        System.out.println("Total Candidato 1: " + cand1);
        System.out.println("Total Candidato 2: " + cand2);
        System.out.println("Total Candidato 3: " + cand3);
        System.out.println("Total Candidato 4: " + cand4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

        e.close();
    }
}