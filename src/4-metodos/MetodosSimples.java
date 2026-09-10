/*
 * RESOLUÇÃO DE EXERCÍCIO — Parte A (Laboratório da Aula 08 — Métodos)
 * Métodos de aquecimento com parâmetros e retorno: soma, areaRetangulo, ehPar, saudacao.
 */
public class MetodosSimples {
    public static void main(String[] args){
        System.out.println(soma(1,2));
        System.out.println(soma(3,4));
        System.out.println(soma(4,7));

        System.out.println(areaRetangulo(5, 4));

        System.out.println(ehPar(2));
        System.out.println(ehPar(3));

        saudacao("Welber");
    }

    static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }

    static double areaRetangulo(double base, double altura){
        double areaRetangulo = base * altura;
        return areaRetangulo;
    }

    static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    static void saudacao(String nome){
        System.out.println("Olá " + nome + "!");
    }

}
