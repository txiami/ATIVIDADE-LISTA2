//7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
//100, usando os tipos de dados int e double .

public class TresACem {
    public static void main(String arg[]) {

        System.out.println("Divisão por 2 de todos os multiplos de 3 entre 1 a 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                float resultadoFloat = i / 2.0f;

                System.out.printf("EM INT %d / 2 = %d \n", i, resultadoInt);
                System.out.printf("EM FLOAT %d / 2 = %f \n\n", i, resultadoFloat);

            }
        }
    }
}