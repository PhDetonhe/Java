import java.util.Scanner;

public class ex05 {
    public static void main(String[] arg) {
        Scanner ler = new Scanner(System.in);


        String nomes[] = new String [5];

        for(int i = 0; i < 5; i++){
            System.out.println("digite o " + i + " nome:");
            nomes[i] = ler.nextLine();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("nome: " + nomes[i]);
        }







    }
}
