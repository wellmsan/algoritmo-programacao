/*
 * MATERIAL DE AULA — Demonstração guiada (Laboratório da Aula 16 — coleções)
 * As operações básicas de um ArrayList: adicionar (no fim e em uma posição), consultar,
 * substituir, buscar e remover — sem precisar controlar capacidade nem deslocar à mão.
 */
import java.util.ArrayList;

public class ListaArrayList {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>(); // começa vazia: size() == 0

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Diego");
        System.out.println(nomes);                    // [Ana, Bruno, Diego]

        nomes.add(2, "Carla");                        // insere no índice 2 (Diego anda)
        System.out.println(nomes);                    // [Ana, Bruno, Carla, Diego]

        System.out.println("Tamanho: " + nomes.size());
        System.out.println("Primeiro: " + nomes.get(0));

        nomes.set(1, "Beatriz");                      // substitui o índice 1
        System.out.println(nomes);                    // [Ana, Beatriz, Carla, Diego]

        System.out.println("Carla está no índice " + nomes.indexOf("Carla"));
        System.out.println("Tem Bruno? " + nomes.contains("Bruno"));

        nomes.remove("Diego");                        // remove pelo VALOR
        nomes.remove(0);                              // remove pelo ÍNDICE
        System.out.println(nomes);                    // [Beatriz, Carla]

        for(int i = 0; i < nomes.size(); i++){        // size(), não length
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
