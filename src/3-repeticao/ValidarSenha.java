/*
 * RESOLUÇÃO DE EXERCÍCIO — D2, desafio opcional (Laboratório da Aula 06)
 * Repete a leitura de uma senha (do-while) até ela ter 6+ caracteres.
 */
import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite uma senha (mínimo 6 caracteres): ");
            senha = leitor.next();

            if(senha.length() < 6){
                System.out.println("Senha muito curta, tente novamente.");
            }
        } while(senha.length() < 6);

        System.out.println("Senha válida!");
    }
}
