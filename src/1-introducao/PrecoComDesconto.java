/*
 * RESOLUÇÃO DE EXERCÍCIO — Laboratório da Aula 04 (UA1)
 * Calcula o preço final de um produto com desconto.
 * Continuação, em Java, do "Problema 2" resolvido em pseudocódigo na Aula 02.
 */
import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço original: ");
        double preco = leitor.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = leitor.nextDouble();

        double valorDesconto = preco * percentualDesconto / 100;
        double precoFinal = preco - valorDesconto;

        System.out.println("Preço original: " + preco);
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Preço final: " + precoFinal);
    }
}
