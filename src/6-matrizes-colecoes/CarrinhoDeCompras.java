/*
 * RESOLUÇÃO DE EXERCÍCIO — B2 (Laboratório da Aula 16, Parte B — ArrayList + menu)
 * Menu do-while sobre um ArrayList<String>: adicionar, remover pelo nome, buscar e listar.
 * Atenção ao leitor.nextLine() logo depois do nextInt() — ele consome o Enter pendente.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> carrinho = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1-Adicionar 2-Remover 3-Buscar 4-Listar 0-Sair");
            opcao = leitor.nextInt();
            leitor.nextLine(); // descarta o Enter que o nextInt() deixou

            if(opcao == 1){
                System.out.print("Item: ");
                carrinho.add(leitor.nextLine());
            } else if(opcao == 2){
                System.out.print("Item a remover: ");
                String item = leitor.nextLine();
                if(carrinho.remove(item)){
                    System.out.println("Removido.");
                } else {
                    System.out.println("Item não está no carrinho.");
                }
            } else if(opcao == 3){
                System.out.print("Item a buscar: ");
                int pos = carrinho.indexOf(leitor.nextLine());
                if(pos == -1){
                    System.out.println("Não encontrado.");
                } else {
                    System.out.println("Encontrado na posição " + pos);
                }
            } else if(opcao == 4){
                for(int i = 0; i < carrinho.size(); i++){
                    System.out.println((i + 1) + ". " + carrinho.get(i));
                }
                System.out.println("Total de itens: " + carrinho.size());
            }
        } while(opcao != 0);
    }
}
