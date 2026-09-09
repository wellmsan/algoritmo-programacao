import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        boolean bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);

        if(bissexto){
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
