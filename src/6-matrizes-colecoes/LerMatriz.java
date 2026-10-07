/*
 * RESOLUÇÃO DE EXERCÍCIO — B1 (Laboratório da Aula 12, Parte B — Matrizes)
 * Lê uma matriz 3x3 do teclado, exibe-a em formato de tabela e mostra a soma de
 * todos os elementos.
 */
import java.util.Scanner;

public class LerMatriz {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int lin = 0; lin < 3; lin++){
            for(int col = 0; col < 3; col++){
                System.out.print("matriz[" + lin + "]["+ col + "]: ");
                matriz[lin][col] = leitor.nextInt();
            }
        }
    }
}










//public class LerMatriz {
//    public static void main(String[] args){
//        Scanner leitor = new Scanner(System.in);
//
//        int[][] m = new int[3][3];
//        int soma = 0;
//
//        for(int lin = 0; lin < m.length; lin++){
//            for(int col = 0; col < m[lin].length; col++){
//                System.out.print("m[" + lin + "][" + col + "] = ");
//                m[lin][col] = leitor.nextInt();
//                soma = soma + m[lin][col];
//            }
//        }
//
//        System.out.println("Matriz digitada:");
//        for(int lin = 0; lin < m.length; lin++){
//            for(int col = 0; col < m[lin].length; col++){
//                System.out.print(m[lin][col] + "\t");
//            }
//            System.out.println(); // quebra de linha ao terminar cada linha
//        }
//
//        System.out.println("Soma dos elementos: " + soma);
//    }
//}
