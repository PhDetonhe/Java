/******************************************************************************
2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz=new int[3][3];
		int somac1 = 0;
		int somac2 = 0;
		int somac3 = 0;


		System.out.println("Digite os numeros da matrix: ");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ler.nextInt();
			}
			 somac1 += matriz[0][0];
             somac2 += matriz[0][1];
             somac3 += matriz[0][2];
		}

    
		
		System.out.println("soma da colunas:");
		System.out.println("soma coluna 1: "+ somac1);
		System.out.println("soma coluna 2: "+ somac2);
		System.out.println("soma coluna 3: "+ somac3);
		
	


	}
}