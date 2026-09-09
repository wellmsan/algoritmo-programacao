/*
 * RESOLUÇÃO DE EXERCÍCIO — B1 (Laboratório da Aula 06, Parte B — Repetição)
 * Soma todos os inteiros de 1 até N, com N lido do teclado.
 */
import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = leitor.nextInt();

        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma = soma + i;
        }

        System.out.println("Soma de 1 até " + n + " = " + soma);
    }
}
