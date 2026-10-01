/*
 * MATERIAL DE AULA — pergunta de verificação
 * Aula 12 (UA3 — Estruturas de Dados)
 * Arrays e métodos: ao contrário de Dobro.java (int), o método recebe uma cópia da
 * REFERÊNCIA para o mesmo vetor — alterar v[i] dentro do método altera o vetor do main.
 */
import java.util.Arrays;

public class DobrarVetor {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3};

        dobrar(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    static void dobrar(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = v[i] * 2;
        }
    }
}
