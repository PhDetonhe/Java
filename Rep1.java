/******************************************************************************

Escreva um programa que exiba os números pares de 1 a 50 
e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int num = 1;
	int num2 = 51;
	System.out.println("Numeros pares de 1 a 50: ");
	while(num < 50) {
	  if(num % 2 == 0){
	      System.out.println(num + " ");
	  }
	  num++;
	}
	
	System.out.println("Numeros impares de 1 a 50: ");
	while(num2 < 100) {
	  if(num2 % 2 == 1){
	      System.out.println(num2 + " ");
	  }
	  num2++;
	}

	 
		
	}
}
