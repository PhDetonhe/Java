/******************************************************************************

exemplo Array

*******************************************************************************/

public class ExArray
{
	public static void main(String[] args) {
		int [] numeros = new int[5];
		
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		numeros[4]=50;
		
		for(int i = 0; i<numeros.length; i++)
		System.out.println("O "+ (i+1) +" º numero é:"+ numeros[i]);
	}
}
