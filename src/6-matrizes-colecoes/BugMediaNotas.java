/*
 * LABORATÓRIO DA AULA 18 — PARTE A (depuração) — E1
 * ATENÇÃO: este programa CONTÉM ERROS PROPOSITAIS. Compila e roda, mas a média sai errada.
 * Sintoma: com as notas 7, 8 e 10 a média esperada é 8.333..., mas o programa mostra outro valor.
 * Use breakpoint + Step Over (F8) e observe "soma" no painel Variables a cada volta.
 */
import java.util.Scanner;

public class BugMediaNotas {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] notas = new int[3];

        for(int i = 0; i < notas.length; i++){
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = leitor.nextInt();
        }

        System.out.println("Média: " + calcularMedia(notas));
    }

    static double calcularMedia(int[] notas){
        int soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma = 0;
            soma = soma + notas[i];
        }
        return soma / notas.length;
    }
}
