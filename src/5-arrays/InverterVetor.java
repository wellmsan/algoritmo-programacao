/*
 * RESOLUÇÃO DE EXERCÍCIO — A1 (Laboratório da Aula 12, Parte A — Vetores)
 * Lê 5 números inteiros e exibe-os na ordem inversa à da digitação.
 */
import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextInt();
        }

        System.out.println("Ordem inversa:");
        // começa no ÚLTIMO índice (length - 1) e desce até 0
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
 }
