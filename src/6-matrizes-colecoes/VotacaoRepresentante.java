/*
 * RESOLUÇÃO DE EXERCÍCIO — Avaliação da UA4 (Laboratório da Aula 18 — gabarito)
 * Votação do representante de turma: lê votos até 0, valida (1 a 3 válidos, outros = nulos),
 * conta em um vetor alinhado ao ArrayList de candidatos e mostra percentuais e vencedor.
 * Caso de teste-limite: nenhum voto válido -> não dividir por zero.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class VotacaoRepresentante {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> candidatos = new ArrayList<>();
        candidatos.add("Ana");
        candidatos.add("Bruno");
        candidatos.add("Carla");
        int[] votos = new int[candidatos.size()];
        int nulos = 0;

        int voto;
        do {
            System.out.print("Voto (1-Ana 2-Bruno 3-Carla, 0 encerra): ");
            voto = leitor.nextInt();
            if(voto != 0){
                if(votoValido(voto, candidatos.size())){
                    votos[voto - 1]++;
                } else {
                    nulos++;
                }
            }
        } while(voto != 0);

        mostrarResultado(candidatos, votos, nulos);
    }

    static boolean votoValido(int voto, int qtdCandidatos){
        return voto >= 1 && voto <= qtdCandidatos;
    }

    static int totalValidos(int[] votos){
        int total = 0;
        for(int i = 0; i < votos.length; i++){
            total = total + votos[i];
        }
        return total;
    }

    static int posicaoVencedor(int[] votos){
        int posMaior = 0;
        for(int i = 1; i < votos.length; i++){
            if(votos[i] > votos[posMaior]){
                posMaior = i;
            }
        }
        return posMaior;
    }

    static void mostrarResultado(ArrayList<String> candidatos, int[] votos, int nulos){
        int validos = totalValidos(votos);
        if(validos == 0){
            System.out.println("Nenhum voto válido. Nulos: " + nulos);
            return;
        }
        for(int i = 0; i < votos.length; i++){
            double percentual = votos[i] * 100.0 / validos;
            System.out.println(candidatos.get(i) + ": " + votos[i] + " voto(s) — " + percentual + "%");
        }
        System.out.println("Nulos: " + nulos);
        System.out.println("Vencedor(a): " + candidatos.get(posicaoVencedor(votos)));
    }

    // Empate: posicaoVencedor fica com o primeiro da lista (usa > e não >=) — vale citar no comentário de testes.
}
