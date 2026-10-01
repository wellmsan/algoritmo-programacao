/*
 * RESOLUÇÃO DE EXERCÍCIO — A2 (Laboratório da Aula 12, Parte A — Vetores)
 * Dado um vetor de vendas diárias, informa o maior e o menor valor e em qual
 * posição (dia) cada um aparece.
 */

public class MaiorMenorPosicao {
    public static void main(String[] args){
        double[] vendas = {320.0, 180.5, 455, 90.0, 610.0, 275.5, 130};
        double maiorValor = 0;
        double menorValor = 10000;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        // Percorre o array para encontrar o maior valor
        for(int i = 0; i < vendas.length; i++){
            if(vendas[i] > maiorValor) {
                maiorValor = vendas[i];
                posicaoMaior = i+1;
            }
        }
        // Percorre o array para encontrar o menor valor
        for(int i = 0; i < vendas.length; i++){
            if(vendas[i] < menorValor){
                menorValor = vendas[i];
                posicaoMenor = i+1;
            }
        }

        System.out.println("Maior valor: " + maiorValor + ". Dia: " + posicaoMaior);
        System.out.println("Menor valor: " + menorValor + ". Dia: " + posicaoMenor);
    }
}


//public class MaiorMenorPosicao {
//    public static void main(String[] args){
//        double[] vendas = {320.0, 180.5, 455.0, 90.0, 610.0, 275.5, 130.0};
//
//        int posMaior = 0;
//        int posMenor = 0;
//
//        // guardamos a POSIÇÃO; o valor sempre pode ser obtido por vendas[pos]
//        for(int i = 1; i < vendas.length; i++){
//            if(vendas[i] > vendas[posMaior]){
//                posMaior = i;
//            }
//            if(vendas[i] < vendas[posMenor]){
//                posMenor = i;
//            }
//        }
//
//        System.out.println("Maior venda: " + vendas[posMaior] + " (dia " + (posMaior + 1) + ")");
//        System.out.println("Menor venda: " + vendas[posMenor] + " (dia " + (posMenor + 1) + ")");
//    }
//}
