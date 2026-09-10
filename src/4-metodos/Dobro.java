/*
 * MATERIAL DE AULA — pergunta de verificação
 * Aula 08 (UA2 — Estruturas de Controle e Modularização)
 * Passagem por valor e escopo local: por que x não muda depois de dobro(x)?
 */
public class Dobro {
    public static void main(String[] args){
        int x = 5;
        int y = dobro(x);

        System.out.println(x + " " + y);
    }

    static int dobro(int n){
        n = n * 2;
        return n;
    }
}
