/*
 * RESOLUÇÃO DE EXERCÍCIO — Parte A (Laboratório da Aula 08 — Métodos)
 * Métodos de aquecimento com parâmetros e retorno: soma, areaRetangulo, ehPar, saudacao.
 */
public class MetodosSimples {
    public static void main(String[] args){
        System.out.println(soma(2, 3));
        System.out.println(soma(10, -4));
        System.out.println(soma(0, 0));

        System.out.println(areaRetangulo(4.0, 2.5));

        System.out.println(ehPar(7));
        System.out.println(ehPar(8));

        saudacao("Turma");
    }

    static int soma(int a, int b){
        return a + b;
    }

    static double areaRetangulo(double base, double altura){
        return base * altura;
    }

    static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    static void saudacao(String nome){
        System.out.println("Olá, " + nome + "!");
    }
}
