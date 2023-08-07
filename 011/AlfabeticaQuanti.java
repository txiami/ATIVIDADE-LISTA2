//11. Escreva um programa que tenha duas palavras como entrada, e a saída
//imprima as palavras em ordem alfabética (utilize o método compareTo da
//
//classe String),. Informe também, qual das palavras tem o maior número de
//caracteres.

import java.util.Scanner;
public class AlfabeticaQuanti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = input.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = input.nextLine().toLowerCase();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao > 0) {
            System.out.println("As palavras em ordem alfabética são: " + palavra2 + ", " + palavra1);
        } else if (comparacao < 0) {
            System.out.println("As palavras em ordem alfabética são: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("As palavras são iguais!");
        }

        int tamanhopalavra1 = palavra1.length();
        int tamanhopalavra2 = palavra2.length();

        if (tamanhopalavra1 > tamanhopalavra2) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (tamanhopalavra2 > tamanhopalavra1) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres!");
        }
    }
}
