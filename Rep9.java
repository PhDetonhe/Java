/******************************************************************************
9.   
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int numTotal = 0;
	for(int i = 0; i < 20; i++ ){
	    System.out.println("digite um numero: ");
	    int num = ler.nextInt();
	    if(num > 10){
	    numTotal++;
	    }
	}
	System.out.println("A quantidade de numeros maiores que 10 é de: "+ numTotal);
}
}
