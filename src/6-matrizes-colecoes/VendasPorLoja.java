/*
 * RESOLUÇÃO DE EXERCÍCIO — B3 (Laboratório da Aula 12, Parte B — Matrizes)
 * vendas[loja][semana]: total por loja (soma de cada LINHA), total por semana
 * (soma de cada COLUNA) e a loja que mais vendeu no mês.
 */
public class VendasPorLoja {
    public static void main(String[] args){
        int[][] vendas = {
            {120, 150, 90, 200},   // loja 0
            {80, 110, 130, 95},    // loja 1
            {210, 180, 160, 190}   // loja 2
        };

        int lojaCampea = 0;
        int maiorTotal = 0;

        // total por loja: linha fixa no laço externo, colunas variam no interno
        for(int loja = 0; loja < vendas.length; loja++){
            int total = 0;
            for(int sem = 0; sem < vendas[loja].length; sem++){
                total = total + vendas[loja][sem];
            }
            System.out.println("Loja " + loja + ": " + total);

            if(total > maiorTotal){
                maiorTotal = total;
                lojaCampea = loja;
            }
        }

        // total por semana: os laços trocam de papel — coluna fixa, linhas variam
        for(int sem = 0; sem < vendas[0].length; sem++){
            int total = 0;
            for(int loja = 0; loja < vendas.length; loja++){
                total = total + vendas[loja][sem];
            }
            System.out.println("Semana " + (sem + 1) + ": " + total);
        }

        System.out.println("Loja campeã: " + lojaCampea + " (" + maiorTotal + ")");
    }
}
