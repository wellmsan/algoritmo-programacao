import java.util.ArrayList;
import java.util.Scanner;

public class ListaChamada{
    public static void main(String[] args){
        ArrayList<String> chamada = new ArrayList<String>();
        Scanner nome = new Scanner(System.in);
        System.out.println("###### Lista de Presença ######");
        do{
            System.out.print("Nome: ");
            chamada.add(nome.nextLine());
        }while(chamada.contains("Fim") != true);
        chamada.remove("Fim");
        System.out.println("Lista: " + chamada);

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Buscar aluno");
        System.out.println("2 - Remover aluno");
        System.out.println("3 - Encerrar");
    }

}
