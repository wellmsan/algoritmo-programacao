/*
 * MATERIAL DE AULA — demonstração guiada
 * Aula 12 (UA3 — Estruturas de Dados) — Laboratório: manipulação de arrays e matrizes
 * Matriz double[][]: cada LINHA é um aluno, cada COLUNA é uma prova. Percorre com
 * laço aninhado (linha externa, coluna interna) e calcula a média de cada aluno.
 */
public class MatrizNotas {
    public static void main(String[] args) {
        double[][] notas = {
                {7.0, 8.5, 6.0},   // aluno 0
                {5.0, 4.5, 6.5},   // aluno 1
                {9.0, 9.5, 10.0},  // aluno 2
                {6.0, 7.0, 8.0}    // aluno 3
        };

//        System.out.println("notas.length (linhas)     = " + notas.length);
//        System.out.println("notas[0].length (colunas) = " + notas[0].length);
//        System.out.println("notas[0].length (colunas) = " + notas[1].length);
//        System.out.println();

        for (int i = 0; i <= 3; i++) {
            System.out.println("Aluno " + i);

            for (int x = 0; x <= 2; x++) {
                System.out.println("Nota " + (x + 1) + ": " + notas[i][x]);
            }

        }
    }
}
