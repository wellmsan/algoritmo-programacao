/*
 * MATERIAL DE AULA — demonstração guiada
 * Aula 12 (UA3 — Estruturas de Dados) — Laboratório: manipulação de arrays e matrizes
 * Padrão "ler → processar → exibir": guarda 7 temperaturas em um double[] e,
 * depois, percorre o vetor para calcular média, maior, menor e dias acima da média.
 */
import java.util.Scanner;

public class TemperaturasSemana {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double[] temperaturas = new double[7];

        // 1) ler: preenche o vetor posição por posição
        for(int i = 0; i < temperaturas.length; i++){
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = leitor.nextDouble();
        }

        // 2) processar: acumulador + maior/menor começando pelo primeiro elemento
        double soma = 0;
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for(int i = 0; i < temperaturas.length; i++){
            soma = soma + temperaturas[i];
            if(temperaturas[i] > maior){
                maior = temperaturas[i];
            }
            if(temperaturas[i] < menor){
                menor = temperaturas[i];
            }
        }

        double media = soma / temperaturas.length;

        // contar só é possível DEPOIS de conhecer a média — por isso o vetor
        int diasAcima = 0;
        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] > media){
                diasAcima++;
            }
        }

        // 3) exibir
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Dias acima da média: " + diasAcima);
    }
}
