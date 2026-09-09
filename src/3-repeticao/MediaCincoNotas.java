/*
 * RESOLUÇÃO DE EXERCÍCIO — B2 (Laboratório da Aula 06, Parte B — Repetição)
 * Lê 5 notas, calcula a média e diz quantas notas ficaram acima da média.
 */
import java.util.Scanner;

public class MediaCincoNotas {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        // vetor pequeno só para guardar as 5 notas e revisitá-las na segunda
        // contagem — o conteúdo de arrays em si só é formalizado na UA3
        double[] notas = new double[5];
        double soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / 5;
        int acimaDaMedia = 0;

        for(int i = 0; i < 5; i++){
            if(notas[i] > media){
                acimaDaMedia++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: " + acimaDaMedia);
    }
}
