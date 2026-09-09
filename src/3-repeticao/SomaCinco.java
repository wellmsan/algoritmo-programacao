/*
 * MATERIAL DE AULA — demonstração guiada
 * Aula 06 (UA2 — Estruturas de Controle e Modularização)
 * Laço while + variável acumuladora: soma de 1 a 5.
 */
public class SomaCinco {
    public static void main(String[] args){
        int i = 1;
        int soma = 0;

        while(i <= 5){
            soma = soma + i;
            i++; //i = i + 1

            System.out.println(soma);
        }


    }
}
