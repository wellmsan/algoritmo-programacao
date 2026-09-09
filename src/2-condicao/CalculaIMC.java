/*
 * RESOLUÇÃO DE EXERCÍCIO — A3 (Laboratório da Aula 06, Parte A — Condicionais)
 * Calcula o IMC (peso / altura²) e mostra a faixa de classificação.
 */
import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = leitor.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc < 25){
            System.out.println("Peso normal");
        } else if(imc < 30){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
