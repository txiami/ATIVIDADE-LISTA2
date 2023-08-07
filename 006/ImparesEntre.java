//6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de
//dados int e float.

public class ImparesEntre {
    public static void main(String arg[]){
        int numInt = 1;
        float numFloat = 1.0f;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                numInt *= i;
                numFloat *= i;
            }
        }
        System.out.println("Produto int dos ímpares de 15 a 30 é " + numInt);
        System.out.println("Produto float dos impares de 15 a 30 é " + numFloat);
    }
}
