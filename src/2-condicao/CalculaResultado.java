import java.util.Scanner;

public class CalculaResultado {
    public static void main(String[] args){ // Método principal da classe Java
        Scanner leitor = new Scanner(System.in); // Objeto leitor

        for(int i = 0; i < 5; i++){
            System.out.print("Digita a nota: ");
            double nota = leitor.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida!");
            } else {
                if(nota >= 6){
                    System.out.println("Aprovado");

                    if(nota == 10){
                        System.out.println("Nota Cheia!!!");
                    }

                } else if(nota >= 4 && nota < 6){
                    System.out.println("Exame Final");
                } else {
                    System.out.println("Reprovado");
                }
            }
        }


    }
}