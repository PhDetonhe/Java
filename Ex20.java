/******************************************************************************

Ex20 github
   Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 

*******************************************************************************/
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int num0100 = 0, num101200 = 0, nummais200 = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Por favor, digite o " + i + "º numero: "); 
            int n1 = ler.nextInt();
            
            if (n1 >= 0 && n1 <= 100) {
                num0100++;
            } else if ( n1 >= 101 && n1 <= 200){
                num101200++; 
            } else {
                nummais200++;
            }
        }
        
        System.out.println("\nA quantidade de numeros entre 0 e 100 é de: " + num0100);
        System.out.println("A quantidade de numeros entre 101 e 200 é de: " + num101200);
        System.out.println("A quantidade de numeros que sao maiores que 200 é de: " + nummais200);

    }
}