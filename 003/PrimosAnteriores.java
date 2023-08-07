//Crie uma classe e na função main() implemente um programa que lê um
//número inteiro do teclado e imprime todos os números primos menores que ele
//(divisíveis por 1 ou por ele mesmo).

import java.util.Scanner;

public class PrimosAnteriores {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO");
        int numero = input.nextInt();
        System.out.println("TODOS OS NUMEROS PRIMOS ATÉ ELE SÃO ");
        for (int i = 2; i < numero; i++) {
            if (PrimoOuNAO(i)) {
                System.out.println(i);
            }
        }

    }
    private static boolean PrimoOuNAO(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
