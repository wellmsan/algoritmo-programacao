/*
 * RESOLUÇÃO DE EXERCÍCIO — A4 (Laboratório da Aula 12, Parte A — Vetores)
 * Vetores paralelos: nomes[i] e medias[i] descrevem o MESMO aluno. Lista os
 * aprovados (média >= 7) e exibe a média da turma.
 */
public class AprovadosTurma {
    public static void main(String[] args){
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        double[] medias = {8.5, 6.0, 7.0, 4.5, 9.0};

        double soma = 0;

        System.out.println("Aprovados:");
        for(int i = 0; i < nomes.length; i++){
            soma = soma + medias[i];
            if(medias[i] >= 7){
                System.out.println("- " + nomes[i] + " (" + medias[i] + ")");
            }
        }

        System.out.println("Média da turma: " + (soma / medias.length));
    }
}
