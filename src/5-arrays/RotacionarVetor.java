/*
 * RESOLUÇÃO DE EXERCÍCIO — D1 (Laboratório da Aula 12, Desafio)
 * Rotaciona o vetor uma posição para a direita: o último elemento vai para o início
 * e todos os outros andam uma casa. {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}
 */
import java.util.Arrays;

public class RotacionarVetor {
    public static void main(String[] args){
        int[] v = {1, 2, 3, 4, 5};

        System.out.println("Antes:  " + Arrays.toString(v));

        int ultimo = v[v.length - 1];  // salva antes de sobrescrever

        // percorre de trás para frente — de frente para trás apagaria os valores
        for(int i = v.length - 1; i > 0; i--){
            v[i] = v[i - 1];
        }
        v[0] = ultimo;

        System.out.println("Depois: " + Arrays.toString(v));
    }
}
