//12. Os motoristas se preocupam com a quilometragem obtida por seus
//automóveis. Um
//motorista monitorou vários tanques cheios de gasolina registrando a
//quilometragem dirigida e a quantidade de combustível em litros utilizados para
//cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
//os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
//inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
//em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
//combinada e a soma total de litros de combustível consumidos até esse ponto.
//Todos os cálculos de média devem produzir resultados de ponto flutuante.

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de tanques cheios monitorados: ");
        int quantTanques = input.nextInt();

        int[] quilometros = new int[quantTanques];
        int[] litros = new int[quantTanques];

        for (int i = 0; i < quantTanques; i++) {
            System.out.print("Digite os quilômetros dirigidos no tanque " + (i + 1) + ": ");
            quilometros[i] = input.nextInt();

            System.out.print("Digite a quantidade de litros de gasolina consumidos no tanque " + (i + 1) + ": ");
            litros[i] = input.nextInt();
        }

        System.out.println("\nRelatório de Consumo:");

        double quilometragemTotal = 0;
        double litrosTotal = 0;

        for (int i = 0; i < quantTanques; i++) {
            double consumo = (double) quilometros[i] / litros[i];
            System.out.printf("Tanque %d - Consumo: %.2f km/l%n", (i + 1), consumo);
            quilometragemTotal += quilometros[i];
            litrosTotal += litros[i];
        }

        double consumoMedioTotal = quilometragemTotal / litrosTotal;
        System.out.printf("\nConsumo médio total: %.2f km/l%n", consumoMedioTotal);
    }
}



