/*
 * RESOLUÇÃO DE EXERCÍCIO — D3, desafio opcional (Laboratório da Aula 06)
 * Tabuada completa (1 a 10) usando laço aninhado (for dentro de for).
 */
public class TabuadaCompleta {
    public static void main(String[] args){
        for(int tabuada = 1; tabuada <= 10; tabuada++){
            for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
                System.out.println(tabuada + " x " + multiplicador + " = " + (tabuada * multiplicador));
            }
            System.out.println("---");
        }
    }
}
