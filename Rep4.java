/******************************************************************************

4.   
Crie um programa que solicite ao usuário um número e 
exiba a tabuada desse número utilizando um laço de repetição. 
Utilize for.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		
	    
	    System.out.println("Por favor, digite o numero da tabuada que deseja: ");
	    int numeroTabuada = ler.nextInt();
	    
	    System.out.println("Tabuada do "+ numeroTabuada +":");
	    for(int tabuada = 1; tabuada < 11; tabuada++){
	        int resultado = numeroTabuada * tabuada;
	        System.out.println(numeroTabuada +"*"+ tabuada +"="+resultado);
	        
	    }
	}
}
