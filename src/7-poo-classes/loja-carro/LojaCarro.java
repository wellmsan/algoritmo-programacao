import java.util.ArrayList;
import java.util.Scanner;

public class LojaCarro {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("### Cadastre o Carro ###");

        // Instancia classe Carro (Objecto)
        Carro fastback = new Carro("Fastback", "Fiat", 130.000, 2026);
        Carro ferrari = new Carro("Ferrari", "Ferrari", 500.000, 1998);
        Carro fusca = new Carro("Fusca", "WV", 5.000, 1975);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(fastback);
        carros.add(ferrari);
        carros.add(fusca);

        for(int i = 0; i < carros.size(); i++){
            System.out.println(carros.get(i).toString());
        }



    }
}
