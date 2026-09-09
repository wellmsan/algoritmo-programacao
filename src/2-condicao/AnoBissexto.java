/*
 * RESOLUÇÃO DE EXERCÍCIO — A4 (Laboratório da Aula 06, Parte A — Condicionais)
 * Diz se um ano é bissexto: divisível por 4 e (não por 100, ou por 400).
 */
import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        boolean bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);

        if(bissexto){
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
