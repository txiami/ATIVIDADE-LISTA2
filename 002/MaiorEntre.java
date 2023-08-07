import java.util.Scanner;

public class MaiorEntre {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextFloat();
        double num2 = input.nextFloat();

        System.out.println(maiorValor(num1, num2));
    }

    private static double maiorValor(double num1, double num2) {

        return Math.max(num1, num2);


    }
}

