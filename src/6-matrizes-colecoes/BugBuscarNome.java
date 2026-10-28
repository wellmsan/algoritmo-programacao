/*
 * LABORATÓRIO DA AULA 18 — PARTE A (depuração) — E4
 * ATENÇÃO: este programa CONTÉM ERROS PROPOSITAIS.
 * Sintoma: digitando "Ana", "Bruno" ou "Carla", o programa diz que não encontrou.
 * Atenção: são DOIS erros — depois de corrigir o primeiro, "Ana" funciona, mas "Bruno" ainda não.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BugBuscarNome {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> turma = new ArrayList<>();
        turma.add("Ana");
        turma.add("Bruno");
        turma.add("Carla");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        int pos = buscar(turma, nome);
        if(pos == -1){
            System.out.println(nome + " não encontrado.");
        } else {
            System.out.println(nome + " está na posição " + pos);
        }
    }

    static int buscar(ArrayList<String> lista, String nome){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) == nome){
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
