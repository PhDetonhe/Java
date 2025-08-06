import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ex07 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        Double number;

        System.out.println("Digite números inteiros (digite -1 para encerrar):");

        while (true) {
            number = read.nextDouble();

            if (number == -1) {
                break;
            }

            numeros.add(number);
        }

        double min = Collections.min(numeros);
        double max = Collections.max(numeros);

        System.out.println("o numero maximo é de:" + max);
        System.out.println("o valor minimo é de:" + min);

    }
}
