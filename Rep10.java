/******************************************************************************
10.  Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int numTotal = 0;
	for(int i = 0; i < 10; i++ ){
	    System.out.println("digite um numero: ");
	    int num = ler.nextInt();
	    if(num > 0 && num < 100){
	    numTotal++;
	    }
	}
	System.out.println("A quantidade de numeros que estão entre 0 a 100 é de: "+ numTotal);
}
}
