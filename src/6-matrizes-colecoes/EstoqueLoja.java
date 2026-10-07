/*
 * RESOLUÇÃO DE EXERCÍCIO — Avaliação da UA3 (Laboratório da Aula 16 — gabarito)
 * Estoque com listas paralelas (produtos + quantidades): buscar (-1 se não existe),
 * cadastrar sem duplicar, remover mantendo as duas listas alinhadas e listar com total.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        cadastrar(produtos, quantidades, "Caneta", 50);
        cadastrar(produtos, quantidades, "Caderno", 20);
        cadastrar(produtos, quantidades, "Lápis", 100);

        int opcao;
        do {
            System.out.println("1-Cadastrar 2-Buscar 3-Remover 4-Listar 0-Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if(opcao == 1){
                System.out.print("Produto: ");
                String nome = leitor.nextLine();
                System.out.print("Quantidade: ");
                int qtd = leitor.nextInt();
                cadastrar(produtos, quantidades, nome, qtd);
            } else if(opcao == 2){
                System.out.print("Produto: ");
                int pos = buscar(produtos, leitor.nextLine());
                if(pos == -1){
                    System.out.println("Produto não cadastrado.");
                } else {
                    System.out.println(produtos.get(pos) + ": " + quantidades.get(pos) + " un.");
                }
            } else if(opcao == 3){
                System.out.print("Produto: ");
                remover(produtos, quantidades, leitor.nextLine());
            } else if(opcao == 4){
                listar(produtos, quantidades);
            }
        } while(opcao != 0);
    }

    static int buscar(ArrayList<String> produtos, String nome){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).equals(nome)){
                return i;
            }
        }
        return -1;
    }

    static void cadastrar(ArrayList<String> produtos, ArrayList<Integer> quantidades, String nome, int qtd){
        if(buscar(produtos, nome) != -1){
            System.out.println(nome + " já cadastrado.");
        } else {
            produtos.add(nome);
            quantidades.add(qtd);
        }
    }

    static void remover(ArrayList<String> produtos, ArrayList<Integer> quantidades, String nome){
        int pos = buscar(produtos, nome);
        if(pos == -1){
            System.out.println("Produto não cadastrado.");
        } else {
            produtos.remove(pos);    // pos é int: remove pelo ÍNDICE
            quantidades.remove(pos); // mesmo índice nas duas listas
            System.out.println(nome + " removido.");
        }
    }

    static void listar(ArrayList<String> produtos, ArrayList<Integer> quantidades){
        int total = 0;
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i) + "\t" + quantidades.get(i));
            total = total + quantidades.get(i);
        }
        System.out.println("Itens em estoque: " + total);
    }

    // Questão 5 (resposta esperada): remover/cadastrar dependem da busca linear, que no pior
    // caso compara com todos os n produtos; remover do início ainda desloca os n - 1 seguintes.
}
