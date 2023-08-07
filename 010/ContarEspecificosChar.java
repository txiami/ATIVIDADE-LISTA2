//10. Escreva uma classe que conte a quantidade de vogais, espaços em
//brancos e consoantes de uma cadeia de caracteres.

import java.util.Scanner;

public class ContarEspecificosChar {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        int espacos = 0;
        int vogais = 0;
        int consoante = 0;

        String frase = input.nextLine();
        String frases = frase.toLowerCase();
        int tamanho = frases.length();

        for (int i = 0; i < tamanho; i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                espacos++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vogais++;
            } else{
                consoante++;
            }
        }
        System.out.println("VOGAIS: "+ vogais);
        System.out.println("ESPAÇO EM BRANCO: "+ espacos);
        System.out.println("CONSOANTE: "+ consoante);
    }

}
