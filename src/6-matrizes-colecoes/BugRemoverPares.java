/*
 * LABORATÓRIO DA AULA 18 — PARTE A (depuração) — E3
 * ATENÇÃO: este programa CONTÉM UM ERRO PROPOSITAL.
 * Sintoma: era para sobrar só [7, 9], mas sobra [4, 7, 9].
 * Coloque o breakpoint dentro do if e acompanhe "i" e "numeros" a cada remoção.
 */
import java.util.ArrayList;

public class BugRemoverPares {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(7);
        numeros.add(9);

        removerPares(numeros);
        System.out.println(numeros);
    }

    static void removerPares(ArrayList<Integer> numeros){
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
    }
}
