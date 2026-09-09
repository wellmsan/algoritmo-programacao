import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            if(opcao == 1){
                System.out.print("Digite o primeiro valor: ");
                double a = leitor.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double b = leitor.nextDouble();
                System.out.println("Resultado: " + (a + b));
            } else if(opcao == 2){
                System.out.print("Digite o primeiro valor: ");
                double a = leitor.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double b = leitor.nextDouble();
                System.out.println("Resultado: " + (a * b));
            } else if(opcao != 3){
                System.out.println("Opção inválida");
            }
        } while(opcao != 3);

        System.out.println("Encerrando...");
    }
}
