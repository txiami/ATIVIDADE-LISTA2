//8. Criar uma classe Java que receba uma palavra (String) retorne uma
//mensagem caso a
//palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
//ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso,
//etc.

import java.util.Scanner;

public class EsquerdaDireita {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();
        if (PalindromoSimNao(palavra)) {
            System.out.println(palavra + " é um Palíndromo");
        } else {
            System.out.println(palavra + " não é um Palíndromo");
        }
    }

    public static boolean PalindromoSimNao(String palavra) {
        palavra = palavra.toLowerCase();
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }
}