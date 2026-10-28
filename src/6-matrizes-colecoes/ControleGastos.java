/*
 * RESOLUÇÃO DE EXERCÍCIO — Laboratório da Aula 18, Parte B (programa integrador)
 * Controle de gastos com listas paralelas (descrições + valores): registrar com validação,
 * listar, total/média, maior gasto e remover pela descrição. Cada operação é um método.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ControleGastos {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1-Registrar 2-Listar 3-Total e média 4-Maior gasto 5-Remover 0-Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if(opcao == 1){
                System.out.print("Descrição: ");
                String descricao = leitor.nextLine();
                System.out.print("Valor: ");
                double valor = leitor.nextDouble();
                registrar(descricoes, valores, descricao, valor);
            } else if(opcao == 2){
                listar(descricoes, valores);
            } else if(opcao == 3){
                if(valores.size() == 0){
                    System.out.println("Nenhum gasto registrado.");
                } else {
                    double total = total(valores);
                    System.out.println("Total: R$ " + total);
                    System.out.println("Média: R$ " + (total / valores.size()));
                }
            } else if(opcao == 4){
                if(valores.size() == 0){
                    System.out.println("Nenhum gasto registrado.");
                } else {
                    int pos = posicaoMaior(valores);
                    System.out.println("Maior gasto: " + descricoes.get(pos) + " (R$ " + valores.get(pos) + ")");
                }
            } else if(opcao == 5){
                System.out.print("Descrição: ");
                remover(descricoes, valores, leitor.nextLine());
            } else if(opcao != 0){
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }

    static void registrar(ArrayList<String> descricoes, ArrayList<Double> valores, String descricao, double valor){
        if(valor <= 0){
            System.out.println("Valor inválido: precisa ser maior que zero.");
        } else {
            descricoes.add(descricao);
            valores.add(valor);
        }
    }

    static void listar(ArrayList<String> descricoes, ArrayList<Double> valores){
        for(int i = 0; i < descricoes.size(); i++){
            System.out.println((i + 1) + ". " + descricoes.get(i) + "\tR$ " + valores.get(i));
        }
        System.out.println("Gastos registrados: " + descricoes.size());
    }

    static double total(ArrayList<Double> valores){
        double soma = 0;
        for(int i = 0; i < valores.size(); i++){
            soma = soma + valores.get(i);
        }
        return soma;
    }

    static int posicaoMaior(ArrayList<Double> valores){
        int posMaior = 0;
        for(int i = 1; i < valores.size(); i++){
            if(valores.get(i) > valores.get(posMaior)){
                posMaior = i;
            }
        }
        return posMaior;
    }

    static int buscar(ArrayList<String> descricoes, String descricao){
        for(int i = 0; i < descricoes.size(); i++){
            if(descricoes.get(i).equals(descricao)){
                return i;
            }
        }
        return -1;
    }

    static void remover(ArrayList<String> descricoes, ArrayList<Double> valores, String descricao){
        int pos = buscar(descricoes, descricao);
        if(pos == -1){
            System.out.println("Gasto não encontrado.");
        } else {
            descricoes.remove(pos);
            valores.remove(pos);
            System.out.println(descricao + " removido.");
        }
    }
}
