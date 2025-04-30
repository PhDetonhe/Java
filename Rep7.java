/******************************************************************************

7.    
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double resultado = 1;
	    
		System.out.println("Olá! por favor insira o numero que deseja:");
		int num =ler.nextInt();
		System.out.println("Insira o expoente:");
		int expo = ler.nextInt();
		
		resultado = Math.pow(num, expo);
		
		System.out.println("o resultado dos numeros escolhidos é de: " + resultado);
	}
}
