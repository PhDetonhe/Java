/******************************************************************************

ex.32
 Faça um programa que leia 5 números e informe o maior número.
 

*******************************************************************************/
import java.util.Scanner;
public class ex32
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		
		int n, contador = 0, maiorN = Integer.MIN_VALUE;
		
        while (contador < 5) {
            System.out.print("Digite um número: ");
            n = ler.nextInt();
            contador++;
            
            if (n > maiorN) {
                maiorN = n;
            }
        }
        
        System.out.println("O maior número é: " + maiorN);
    }
}