/*
 * RESOLUÇÃO DE EXERCÍCIO — A2 (Laboratório da Aula 16, Parte A — busca + remoção em array)
 * Busca a 1ª ocorrência de um valor; se existir, remove-o deslocando os seguintes para a
 * esquerda. Se não existir (posição -1), avisa e não altera o vetor.
 */
import java.util.Scanner;

public class RemoverValor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] v = {7, 3, 9, 3, 12, 5, 0, 0, 0, 0}; // capacidade 10
        int qtd = 6;                              // só as 6 primeiras estão em uso

        System.out.print("Valor a remover: ");
        int valor = leitor.nextInt();

        int pos = -1;
        for(int i = 0; i < qtd; i++){
            if(v[i] == valor){
                pos = i;
                break; // só a 1ª ocorrência
            }
        }

        if(pos == -1){
            System.out.println(valor + " não encontrado.");
        } else {
            for(int i = pos; i < qtd - 1; i++){
                v[i] = v[i + 1];
            }
            qtd--;
            System.out.println("Removido da posição " + pos);
        }

        for(int i = 0; i < qtd; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
