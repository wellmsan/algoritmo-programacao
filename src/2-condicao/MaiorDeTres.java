/*
 * RESOLUÇÃO DE EXERCÍCIO — A1 (Laboratório da Aula 06, Parte A — Condicionais)
 * Lê 3 números e informa o maior, tratando o caso de empate.
 */
import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = leitor.nextDouble();

        if(n1 == n2 && n2 == n3){
            System.out.println("Empate entre os três: " + n1);
        } else if(n1 >= n2 && n1 >= n3){
            System.out.println("O maior é: " + n1);
        } else if(n2 >= n1 && n2 >= n3){
            System.out.println("O maior é: " + n2);
        } else {
            System.out.println("O maior é: " + n3);
        }
    }
}
