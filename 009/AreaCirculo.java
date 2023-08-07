//9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
//é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
//que ser arredondado.

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

        double resultado = CalculoArea(raio);
        System.out.println("A área do circulo é "+ Math.round(resultado));

    }
    public static Double CalculoArea (double raio){
        return Math.PI * Math.pow(raio, 2);
    }
}
