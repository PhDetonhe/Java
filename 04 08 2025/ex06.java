import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int[10];
        int soma = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Informe o " + (i + 1) + " valor");
            v[i] = ler.nextInt();
            soma += v[i];
        }

        if (soma > 15) {
            System.out.println("A soma dos numeros dos vetores é de: " + soma);
        } else {
            System.out.println("a soma dos valores é menor que 10");
        }
    }
}
