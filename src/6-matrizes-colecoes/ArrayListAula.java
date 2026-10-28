import java.util.ArrayList;

public class ArrayListAula {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Juliana");

        System.out.println("Tamanho: "+ nomes.size());
        System.out.println("Nomes: " + nomes);

        nomes.add(1, "Roberval");

        System.out.println("Nomes: " + nomes);
        System.out.println("Posição(2): " + nomes.get(2));

        nomes.set(1, "Priscila");
        System.out.println("Nomes: " + nomes);
        System.out.println("Tamanho: " + nomes.size());

        System.out.println(nomes.indexOf("Amanda"));
        System.out.println(nomes.contains("Ju"));

        nomes.remove("Juliana");
        System.out.println("Nomes: " + nomes);
        nomes.remove(1);
        System.out.println("Nomes: " + nomes);
    }
}