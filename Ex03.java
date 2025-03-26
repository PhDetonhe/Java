/******************************************************************************

Github
 Ex03

*******************************************************************************/
import java.util.Scanner;
public class Ex03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double n1, n2, n3;
        System.out.print("Digite o primeiro numero: ");
        n1 = ler.nextDouble();
        System.out.print("Digite o segundo numero: ");
        n2 = ler.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        n3 = ler.nextDouble();
        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro numero é o maior.");
        } 
        else if (n2 > n1 && n2 > n3) {
            System.out.println("O segundo numero é o maior.");
        }
        else if (n3 > n2 && n3 > n1) {
            System.out.println("O terceiro numero é o maior.");
        }
        else {
            System.out.println("Ambos os numeros sao iguais.");
        }
     
    }
}