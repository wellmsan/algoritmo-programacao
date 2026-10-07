/*
 * RESOLUÇÃO DE EXERCÍCIO — D1 (Laboratório da Aula 16 — desafio opcional)
 * Lê números até 0 e mantém o ArrayList sempre em ordem crescente: cada número é
 * inserido antes do primeiro elemento maior que ele (busca a posição + add(pos, x)).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class InserirOrdenado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite números (0 para encerrar):");
        int x = leitor.nextInt();
        while(x != 0){
            int pos = 0;
            while(pos < lista.size() && lista.get(pos) <= x){
                pos++;
            }
            lista.add(pos, x);
            System.out.println(lista);
            x = leitor.nextInt();
        }
    }
}
