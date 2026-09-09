/*
 * RESOLUÇÃO DE EXERCÍCIO — D1, desafio opcional (Laboratório da Aula 06)
 * FizzBuzz de 1 a 100.
 */
public class FizzBuzz {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
