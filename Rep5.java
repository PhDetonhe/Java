/******************************************************************************

5. Faça um programa que calcule e 
exiba a soma dos números pares de 1 a 100 
utilizando um laço de repetição. Utilize while.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int numPar = 1; 
	    int soma = 0;
	    
		while(numPar <= 100){
		    if(numPar % 2 == 0){
		 soma += numPar;
		    }
		 numPar++;
		}
		
		System.out.println("Soma de numeros pares de 1 a 100: " + soma);
		 
	}
}
