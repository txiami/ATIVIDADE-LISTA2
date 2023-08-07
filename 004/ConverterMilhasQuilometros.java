//Pretende-se escrever um programa que leia do teclado uma distância
//expressa em milhas, converte-a para quilômetros e apresenta o resultado no
//console. (fórmula de conversão: 1 milha = 1.609 km).

import java.util.Scanner;

public class ConverterMilhasQuilometros {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converter milhas para quilometros");
        System.out.printf("MILHAS: ");
        int milhas = input.nextInt();
        double quilometro = milhas * 1.690;

        System.out.printf("\nQUILOMETROS: %.3f KM",quilometro);

    }
}
