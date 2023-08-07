//5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
//tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
//Terça corresponde a 2, e assim por diante. Utilizando Array.

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String[] dia = {"SEGUNDA", "TERÇA", "QUARTA", "QUINTA",
                                "SEXTA", "SABADO", "DOMINGO"};

        System.out.println("Digite o dia da semana");
        int numero = input.nextInt();
        System.out.println("Esse numero equivale a " + dia[numero - 1]);


    }
}
