import java.util.Scanner;

public class ex01 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int a, b;


        System.out.println("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.println("Informe o segundo valor");
        b = ler.nextInt();

        System.out.println("Resultados: ");
        System.out.println("soma: " + (a+b));
        System.out.println("subtração: " + (a-b));
        System.out.println("multiplicação: " + (a*b));
        System.out.println("divisão inteira: "+ (a%b));
        System.out.println("divisão exata: "+ ((double) a/b));

    }
}
