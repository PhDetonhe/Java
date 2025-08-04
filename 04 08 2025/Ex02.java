import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int n1 = ler.nextInt();
        System.out.println("Digite o segundo valor");
        int n2 = ler.nextInt();
        System.out.println("Digite o terceiro valor");
        int n3 = ler.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro valor é maior");
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("O segundo valor é maior");
        }
        else{
            System.out.println("O terceiro valor é maior.");
        }
    }

}
