/*
 * RESOLUÇÃO DE EXERCÍCIO — Parte B, gabarito (Laboratório da Aula 08 — Métodos)
 * Decompõe o cálculo de situação do aluno em métodos reutilizáveis
 * (lerNota, calcularMedia, classificar, exibirResultado).
 */
import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double nota1 = lerNota(leitor, "Digite a primeira nota: ");
        double nota2 = lerNota(leitor, "Digite a segunda nota: ");
        double nota3 = lerNota(leitor, "Digite a terceira nota: ");

        double media = calcularMedia(nota1, nota2, nota3);
        String status = classificar(media);

        exibirResultado(media, status);
    }

    static double lerNota(Scanner sc, String rotulo){
        System.out.print(rotulo);
        return sc.nextDouble();
    }

    static double calcularMedia(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }

    static String classificar(double media){
        if(media >= 7){
            return "Aprovado";
        } else if(media >= 4){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    static void exibirResultado(double media, String status){
        System.out.println("Média: " + media);
        System.out.println("Situação: " + status);
    }
}
