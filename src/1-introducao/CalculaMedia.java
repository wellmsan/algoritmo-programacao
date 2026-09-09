/*
 * MATERIAL DE AULA — demonstração
 * Aula 04 (UA1 — Fundamentos de Algoritmos e Lógica de Programação)
 * Média de duas notas: variáveis double, leitura com Scanner e aritmética.
 */
import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua nota");
        double nota = leitor.nextDouble();

        System.out.println("Digite a outa nota");
        double outraNota = leitor.nextDouble();

        System.out.println("Nota: " + nota);
        System.out.println("Digite Outra Nota: " + outraNota);

        double media = (nota + outraNota)/2;

        System.out.println("Média: " + media);
    }
}
