/******************************************************************************
3. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] maior=new int[6][3];
		int somac1 = 0;
		int somac2 = 0;
		int somac3 = 0;
		int max = 0;
		int min = 1000000;

        System.out.println("Digite os numeros da matrix: ");
		for(int i = 0; i < maior.length; i++) {
			for(int j = 0; j < maior[i].length; j++) {
				maior[i][j] = ler.nextInt();
			}
		}

		
		for(int i = 0; i < maior.length; i++) {
			for(int j = 0; j < maior[i].length; j++) {
				if(maior[i][j] >= max){
				    max = maior[i][j];
				}
				if(maior[i][j] <= min){
				    min = maior[i][j];
				}
			}
		}



        
        System.out.println("Matriz: ");
		for(int i = 0; i < maior.length; i++) {
			for(int j = 0; j < maior[i].length; j++) {
				System.out.println(maior[i][j] + "");
			}
		}
		System.out.println();
		
		System.out.println("Maior numero: " + max);
        System.out.println("Menor numero: " + min);
	
		
	


	}
}