/*
 * RESOLUÇÃO DE EXERCÍCIO — A1 (Laboratório da Aula 16, Parte A — inserção em array)
 * Insere um valor em uma posição escolhida de um vetor parcialmente preenchido,
 * deslocando os demais para a direita, e informa quantos elementos foram deslocados.
 */
import java.util.Scanner;

public class InserirNaPosicao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] v = new int[10];
        v[0] = 5;
        v[1] = 8;
        v[2] = 12;
        v[3] = 20;
        int qtd = 4;

        System.out.print("Valor a inserir: ");
        int valor = leitor.nextInt();
        System.out.print("Posição (0 a " + qtd + "): ");
        int pos = leitor.nextInt();

        if(qtd == v.length){
            System.out.println("Vetor cheio!");
        } else if(pos < 0 || pos > qtd){
            System.out.println("Posição inválida!");
        } else {
            int deslocamentos = 0;
            for(int i = qtd; i > pos; i--){
                v[i] = v[i - 1];
                deslocamentos++;
            }
            v[pos] = valor;
            qtd++;

            for(int i = 0; i < qtd; i++){
                System.out.print(v[i] + " ");
            }
            System.out.println();
            System.out.println("Deslocamentos: " + deslocamentos);
        }
    }
}
