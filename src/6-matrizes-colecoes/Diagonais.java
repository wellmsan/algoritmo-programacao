/*
 * RESOLUÇÃO DE EXERCÍCIO — B2 (Laboratório da Aula 12, Parte B — Matrizes)
 * Soma a diagonal principal (lin == col) e a diagonal secundária
 * (lin + col == n - 1) de uma matriz quadrada.
 */
public class Diagonais {
    public static void main(String[] args){
        int[][] m = {
            {2, 0, 1, 3},
            {4, 5, 6, 1},
            {7, 8, 9, 2},
            {3, 1, 4, 6}
        };

        int n = m.length;
        int principal = 0;
        int secundaria = 0;

        // em matriz quadrada basta UM laço: a diagonal tem exatamente n elementos
        for(int i = 0; i < n; i++){
            principal = principal + m[i][i];
            secundaria = secundaria + m[i][n - 1 - i];
        }

        System.out.println("Diagonal principal: " + principal);
        System.out.println("Diagonal secundária: " + secundaria);
    }
}
