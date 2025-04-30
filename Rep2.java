/******************************************************************************

Escreva um programa que exiba os números pares de 1 a 50 e 
os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	System.out.println("Numeros pares de 1 até 50: ");
	for(int num1 = 1; num1 < 50; num1++ ){
	    if(num1 % 2 == 0){
	        System.out.println(num1 + " ");
	}
	}
	
	System.out.println("Numeros impares de 51 até 100: ");
	for(int num2 = 51; num2 < 100; num2++ ){
	    if(num2 % 2 == 1){
	        System.out.println(num2 + " ");
	}
	}
}
}
