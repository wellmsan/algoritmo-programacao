/*
 * MATERIAL DE AULA — Demonstração guiada (Laboratório da Aula 16 — busca, inserção e remoção)
 * Array de capacidade fixa com "tamanho lógico" (qtd): busca linear, inserção em uma
 * posição (deslocando para a direita) e remoção de uma posição (deslocando para a esquerda).
 */
public class InserirRemoverVetor {
    public static void main(String[] args){
        int[] v = new int[10]; // capacidade: 10 posições
        int qtd = 0;           // quantas posições estão em uso

        qtd = inserir(v, qtd, 0, 10);
        qtd = inserir(v, qtd, 1, 20);
        qtd = inserir(v, qtd, 2, 40);
        exibir(v, qtd);

        qtd = inserir(v, qtd, 2, 30); // entra no meio: 40 anda uma casa para a direita
        exibir(v, qtd);

        int pos = buscar(v, qtd, 20);
        System.out.println("20 está na posição " + pos);

        qtd = remover(v, qtd, pos);   // 30 e 40 andam uma casa para a esquerda
        exibir(v, qtd);

        System.out.println("99 está na posição " + buscar(v, qtd, 99));
    }

    // Busca linear: devolve a posição da 1ª ocorrência ou -1 se não encontrar
    static int buscar(int[] v, int qtd, int valor){
        for(int i = 0; i < qtd; i++){
            if(v[i] == valor){
                return i;
            }
        }
        return -1;
    }

    // Devolve a nova quantidade (qtd é int: o método recebe só uma cópia)
    static int inserir(int[] v, int qtd, int pos, int valor){
        if(qtd == v.length){
            System.out.println("Vetor cheio!");
            return qtd;
        }
        if(pos < 0 || pos > qtd){
            System.out.println("Posição inválida!");
            return qtd;
        }
        for(int i = qtd; i > pos; i--){
            v[i] = v[i - 1]; // de trás para frente, senão sobrescreve
        }
        v[pos] = valor;
        return qtd + 1;
    }

    static int remover(int[] v, int qtd, int pos){
        if(pos < 0 || pos >= qtd){
            System.out.println("Posição inválida!");
            return qtd;
        }
        for(int i = pos; i < qtd - 1; i++){
            v[i] = v[i + 1]; // da frente para trás
        }
        return qtd - 1;
    }

    static void exibir(int[] v, int qtd){
        System.out.print("[");
        for(int i = 0; i < qtd; i++){
            System.out.print(v[i]);
            if(i < qtd - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]  qtd = " + qtd);
    }
}
