/******************************************************************************

Ex18
 Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int mediaidade=0, Maior18=0, menor18=0, soma=0;
	    for(int i = 1; i <= 7; i++){
		System.out.println("Por favor, informe a idade da "+ i +" º pessoa: ");
		int idade = ler.nextInt();
		soma += idade;
		if(idade >= 18){
		    Maior18++;
		}else
		 menor18++;
	    }
	    
	    mediaidade = soma / 7;
	    System.out.print("A soma de todas as idades é de: "+ soma);
	    System.out.print(" A media de todas as idades é de: "+ mediaidade);
	    System.out.print(" A quantidade de pessoas maiores de idade é de: "+ Maior18);
		
		
	}
}
