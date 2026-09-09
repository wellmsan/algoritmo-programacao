/*
 * RESOLUÇÃO DE EXERCÍCIO — desafio opcional (Laboratório da Aula 08 — Métodos)
 * Sobrecarga de métodos (overloading): maior para int e para double.
 */
public class MaiorSobrecarga {
    public static void main(String[] args){
        System.out.println(maior(3, 7));
        System.out.println(maior(3.5, 2.1));
    }

    static int maior(int a, int b){
        return a > b ? a : b;
    }

    static double maior(double a, double b){
        return a > b ? a : b;
    }
}
