/**************************************************************************************************************
49 Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
***********************************************************************************************************************/
import java.util.Scanner;
public class ex49 {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		Scanner ler = new Scanner(System.in);
		System.out.println("Primeiro vetor: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o "+(i+1)+"° número: ");
			array1[i] = ler.nextInt();
		}
		System.out.println("Segundo vetor: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o "+(i+1)+"° número: ");
			array2[i] = ler.nextInt();
		}
		int somaTotal = 0;
		for (int i = 0; i < 10; i++) {
			somaTotal += array1[i] + array2[i];
		}
		System.out.println("A soma dos dois arrays é igual a: " + somaTotal);
	}
}
