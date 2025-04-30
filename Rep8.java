/******************************************************************************
Leia a idade de cinco pessoas e exiba a soma e a média das idades. 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int somaIdade = 0;
	for(int i = 1; i < 6; i++ ){
	    System.out.println("digite a idade da "+ i +" Pessoa: ");
	    int idade = ler.nextInt();
	    somaIdade += idade;
	}
	double Midade = somaIdade / 5;
	
	System.out.println("A soma total das idades é de: "+ somaIdade + ". E a media das idades é de: " + Midade);
	
	
	

}
}
