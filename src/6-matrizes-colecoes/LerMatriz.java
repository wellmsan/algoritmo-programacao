/*
 * RESOLUÇÃO DE EXERCÍCIO — B1 (Laboratório da Aula 12, Parte B — Matrizes)
 * Lê uma matriz 3x3 do teclado, exibe-a em formato de tabela e mostra a soma de
 * todos os elementos.
 */
import java.util.Scanner;

public class LerMatriz {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int lin = 0; lin < 3; lin++){
            for(int col = 0; col < 3; col++){
                System.out.print("matriz[" + lin + "]["+ col + "]: ");
                matriz[lin][col] = leitor.nextInt();
            }
        }
    }
}


// Complete a resposta