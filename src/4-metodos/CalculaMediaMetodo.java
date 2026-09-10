/*
 * MATERIAL DE AULA — demonstração
 * Aula 08 (UA2 — Estruturas de Controle e Modularização)
 * Anatomia de um método: refatoração de CalculaMedia.java extraindo calcularMedia().
 */
import java.util.Scanner;

public class CalculaMediaMetodo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = leitor.nextDouble();

        double media = calcularMedia(nota1, nota2);

        System.out.println("Digite a primeira nota");

        System.out.println("Média: " + media);
    }

    static double calcularMedia(double n1, double n2){
        double media = (n1 + n2) / 2;
        return media;
    }
}
