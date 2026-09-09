/*
 * RESOLUÇÃO DE EXERCÍCIO — B3 (Laboratório da Aula 06, Parte B — Repetição)
 * Lê números até o usuário digitar 0 (sentinela); ao final, mostra quantos foram pares.
 */
import java.util.Scanner;

public class ContarParesAteZero {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int pares = 0;

        System.out.print("Digite um número (0 para parar): ");
        int numero = leitor.nextInt();

        while(numero != 0){
            if(numero % 2 == 0){
                pares++;
            }

            System.out.print("Digite um número (0 para parar): ");
            numero = leitor.nextInt();
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}
