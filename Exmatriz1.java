/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Exmatriz1
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] pares=new int[2][2];
		int Npares = 0;


		System.out.println("Digite os numeros da matrix: ");
		for(int i = 0; i < pares.length; i++) {
			for(int j = 0; j < pares[i].length; j++) {
				pares[i][j] = ler.nextInt();


			}
		}



		for(int i = 0; i < pares.length; i++) {
			for(int j = 0; j < pares[i].length; j++) {
				double par = pares[i][j] % 2;
				if(par == 0) {
					Npares++;
				}
			}
		}



		System.out.println("pares: "+ Npares);
		System.out.println("Matriz: ");
		for(int i = 0; i < pares.length; i++) {
			for(int j = 0; j < pares[i].length; j++) {
				System.out.println(pares[i][j] + "");
			}
		}
		System.out.println();


	}
}