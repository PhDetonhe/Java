/******************************************************************************

Ex17
Github
 Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

*******************************************************************************/
import java.util.Scanner;
public class Ex17                    
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double soma = 0;
	    for(int i=1; i <= 10; i++ ){
		System.out.print("Digite o numero "+ i + ":");
		double n = ler.nextDouble();
		soma += n;
	    }
	    
	    System.out.print("A soma total dos numeros é: "+ soma);
	}
}
