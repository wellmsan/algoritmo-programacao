/*
 * RESOLUÇÃO DE EXERCÍCIO — B1 (Laboratório da Aula 16, Parte B — ArrayList)
 * Monta a lista de presença lendo nomes até "fim", verifica se um aluno está presente
 * (contains/indexOf) e remove um aluno que saiu mais cedo.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeChamada {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> presentes = new ArrayList<>();

        System.out.println("Digite os nomes (\"fim\" para encerrar):");
        String nome = leitor.nextLine();
        while(!nome.equals("fim")){
            presentes.add(nome);
            nome = leitor.nextLine();
        }
        System.out.println("Presentes (" + presentes.size() + "): " + presentes);

        System.out.print("Consultar aluno: ");
        String consulta = leitor.nextLine();
        if(presentes.contains(consulta)){
            System.out.println(consulta + " está presente (índice " + presentes.indexOf(consulta) + ").");
        } else {
            System.out.println(consulta + " não está na lista.");
        }

        System.out.print("Quem saiu mais cedo? ");
        String saiu = leitor.nextLine();
        if(presentes.remove(saiu)){ // remove(Object) devolve true se encontrou
            System.out.println(saiu + " removido.");
        } else {
            System.out.println(saiu + " não estava na lista.");
        }
        System.out.println("Lista final (" + presentes.size() + "): " + presentes);
    }
}
