/*
 * RESOLUÇÃO DE EXERCÍCIO — D2 (Laboratório da Aula 12, Desafio)
 * Gera a transposta de uma matriz 2x3: o elemento [lin][col] vai para [col][lin],
 * então a transposta tem dimensões invertidas (3x2).
 */
public class MatrizTransposta {
    public static void main(String[] args){
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] t = new int[m[0].length][m.length];

        for(int lin = 0; lin < m.length; lin++){
            for(int col = 0; col < m[lin].length; col++){
                t[col][lin] = m[lin][col];
            }
        }

        for(int lin = 0; lin < t.length; lin++){
            for(int col = 0; col < t[lin].length; col++){
                System.out.print(t[lin][col] + "\t");
            }
            System.out.println();
        }
    }
}
