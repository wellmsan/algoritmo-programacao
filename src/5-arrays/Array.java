
public class Array {
    public static void main(String[] args){
        int[] valores = {4, 8, 15, 16, 23};
        double[] notas = new double[3];
        notas[1] = 7.5;
        notas[0] = 10;

        System.out.println(notas[1]);

        System.out.println("Array valores: " + valores.length);
        System.out.println("Array notas: " + notas.length);
        System.out.println(valores[1] + valores[valores.length - 1]);
        System.out.println(valores.length);

        //valores[5] = 42; // ERROR - Index 5 out of bounds for length 5

        // FOR, While, do While
        System.out.println("Valores no array");
        for(int i = 0; i <= valores.length - 1; i++){
            System.out.println(valores[i]);
        }

        int i = 0;
        while(i <= valores.length - 1){
            System.out.println(valores[i]);
            i++;
        }

        int x = 0;
        do {
            System.out.println(valores[x]);
            x++;
        } while(x <= valores.length - 1);


    }
}