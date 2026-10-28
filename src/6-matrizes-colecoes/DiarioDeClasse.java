/*
 * DEMONSTRAÇÃO GUIADA — Aula 18 (UA4: programa integrador)
 * Junta tudo das UA1–UA3 em um programa só: menu do-while, condicionais, laços,
 * métodos e listas paralelas (ArrayList). Na demonstração de depuração, troque
 * ">= 7" por "> 7" em situacao() para provocar o erro de limite (nota 7.0 reprovada).
 */
import java.util.ArrayList;
import java.util.Scanner;


public class DiarioDeClasse {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        int opcao;

        System.out.println("###### Diário de Classe ######");

        do {
            System.out.println("Escola uma opção: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Resumo");
            System.out.println("0 - Sair");
            System.out.print("OPÇÃO: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if(opcao == 1){
                System.out.print("Nome: ");
                nomes.add(leitor.nextLine());

                System.out.print("Nota: ");
                double nota = leitor.nextDouble();
                notas.add(nota);

                System.out.println("Resultado: " + situacaoAluno(nota));
                System.out.println();
            } else if (opcao == 2) {
                listarAlunos(nomes, notas);
                System.out.println();
            } else if (opcao == 3) {
                System.out.println("Media da turma: " + mediaTurma(notas));
                System.out.println("Maior nota: " + maiorNota(notas));
                System.out.println();
            }

        } while(opcao != 0);
    }

    public static String situacaoAluno(double nota){
        String resultado = "Reprovado";
        if(nota >= 7){
            resultado = "Aprovado";
        }

        return resultado;
    }

    public static void listarAlunos(ArrayList<String> nomes, ArrayList<Double> notas){
        for(int i = 0; i < nomes.size(); i++){
            System.out.println("Nome: " + nomes.get(i) + " - Nota: " + notas.get(i) + " - Result: " + situacaoAluno(notas.get(i)));
        }
    }

    public static double mediaTurma(ArrayList<Double> notas){
        double somaNotas = 0;
        for(int i = 0; i < notas.size(); i++){
            somaNotas += notas.get(i);
        }

        return somaNotas / notas.size();
    }

    public static double maiorNota(ArrayList<Double> notas){
        double maiorNota = 0;
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) > maiorNota){
                maiorNota = notas.get(i);
            }
        }

        return maiorNota;
    }


}















//public class DiarioDeClasse {
//    static final double MEDIA_APROVACAO = 7.0;
//
//    public static void main(String[] args){
//        Scanner leitor = new Scanner(System.in);
//        ArrayList<String> nomes = new ArrayList<>();
//        ArrayList<Double> notas = new ArrayList<>();
//
//        nomes.add("Ana");   notas.add(8.5);
//        nomes.add("Bruno"); notas.add(5.0);
//        nomes.add("Carla"); notas.add(7.0);
//
//        int opcao;
//        do {
//            System.out.println("1-Cadastrar 2-Listar 3-Resumo da turma 0-Sair");
//            opcao = leitor.nextInt();
//            leitor.nextLine();
//
//            if(opcao == 1){
//                System.out.print("Nome: ");
//                String nome = leitor.nextLine();
//                System.out.print("Nota (0 a 10): ");
//                double nota = leitor.nextDouble();
//                if(nota < 0 || nota > 10){
//                    System.out.println("Nota inválida. Aluno não cadastrado.");
//                } else {
//                    nomes.add(nome);
//                    notas.add(nota);
//                }
//            } else if(opcao == 2){
//                listar(nomes, notas);
//            } else if(opcao == 3){
//                if(notas.size() == 0){
//                    System.out.println("Turma vazia.");
//                } else {
//                    System.out.println("Média da turma: " + media(notas));
//                    int pos = posicaoMaiorNota(notas);
//                    System.out.println("Maior nota: " + nomes.get(pos) + " (" + notas.get(pos) + ")");
//                }
//            }
//        } while(opcao != 0);
//    }
//
//    static String situacao(double nota){
//        if(nota >= MEDIA_APROVACAO){
//            return "Aprovado";
//        }
//        return "Reprovado";
//    }
//
//    static double media(ArrayList<Double> notas){
//        double soma = 0;
//        for(int i = 0; i < notas.size(); i++){
//            soma = soma + notas.get(i);
//        }
//        return soma / notas.size();
//    }
//
//    static int posicaoMaiorNota(ArrayList<Double> notas){
//        int posMaior = 0;
//        for(int i = 1; i < notas.size(); i++){
//            if(notas.get(i) > notas.get(posMaior)){
//                posMaior = i;
//            }
//        }
//        return posMaior;
//    }
//
//    static void listar(ArrayList<String> nomes, ArrayList<Double> notas){
//        for(int i = 0; i < nomes.size(); i++){
//            System.out.println(nomes.get(i) + "\t" + notas.get(i) + "\t" + situacao(notas.get(i)));
//        }
//    }
//}
