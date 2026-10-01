/*
 * RESOLUÇÃO DE EXERCÍCIO — A3 (Laboratório da Aula 12, Parte A — Vetores)
 * Busca linear: lê um valor e informa quantas vezes ele aparece no vetor e em qual
 * posição aparece pela primeira vez (ou -1, se não aparece).
 */
import java.util.Scanner;

public class BuscarValor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = {7, 3, 9, 3, 12, 5, 3, 8, 1, 9};

        System.out.print("Valor a buscar: ");
        int procurado = leitor.nextInt();

        int ocorrencias = 0;
        int primeiraPosicao = -1; // -1 = "ainda não encontrei"

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == procurado){
                ocorrencias++;
                if(primeiraPosicao == -1){
                    primeiraPosicao = i;
                }
            }
        }

        System.out.println("Ocorrências: " + ocorrencias);
        System.out.println("Primeira posição: " + primeiraPosicao);
    }
}
