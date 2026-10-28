/*
 * LABORATÓRIO DA AULA 18 — PARTE A (depuração) — E2
 * ATENÇÃO: este programa CONTÉM ERROS PROPOSITAIS.
 * Sintoma 1: o programa termina com ArrayIndexOutOfBoundsException.
 * Sintoma 2 (depois de corrigir o 1): a maior temperatura de uma semana de inverno no
 * Sul (todas negativas) aparece como 0.
 */
public class BugMaiorTemperatura {
    public static void main(String[] args){
        double[] semana = {-3.5, -1.0, -4.2, -0.5, -2.0, -6.1, -1.8};
        System.out.println("Maior temperatura: " + maior(semana));
    }

    static double maior(double[] v){
        double maior = 0;
        for(int i = 0; i <= v.length; i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior;
    }
}
