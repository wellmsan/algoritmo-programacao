import java.util.Scanner;

public class ClassificaTriangulo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = leitor.nextDouble();

        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Não formam triângulo");
        } else if(a == b && b == c){
            System.out.println("Equilátero");
        } else if(a == b || a == c || b == c){
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
