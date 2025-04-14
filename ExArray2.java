/******************************************************************************

exemplo Array

*******************************************************************************/
import java.util.Scanner;
public class ExArray2
{
	public static void main(String[] args) {
		int [] numeros = new int[5];
		Scanner ler = new Scanner (System.in);
	
		
		for(int i = 0; i<numeros.length; i++){
		System.out.println("Digite o "+ (i+1)+ " º numero");
		numeros[i] = ler.nextInt();
		}
		for(int i =0; i<numeros.length;i++){
		    System.out.println("O "+ (i+1) +"º numero é igual a:"+ numeros[i]);
		}
	    
			
	}
}
