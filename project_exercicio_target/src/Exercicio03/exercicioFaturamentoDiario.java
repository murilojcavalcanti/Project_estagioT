package Exercicio03;

import java.util.Arrays;

public class exercicioFaturamentoDiario {
    public static void main(String[] args) {
        int faturamentoDiario[] = {83, 95, 115, 45, 40, 0, 0, 58, 60, 70, 93, 87, 0, 0,
                45, 95, 115, 45, 40, 0, 0, 40, 5, 0, 18, 60, 0, 0, 35, 28};
        int Dm[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int C = 0;

        while (C < faturamentoDiario.length) {
            System.out.println("O faturamento diario no dia " + Dm[C] + " é " + faturamentoDiario[C]);
            C++;
        }
    }
}
