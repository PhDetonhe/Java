
/******************************************************************************

Ex22
Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 

*******************************************************************************/
import java.util.Scanner;
public class Ex22
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int total = 7;
	    int contagemF = 0;
	    int contagemM = 0;
	    int somaidadeF = 0;
	    int somaidadeM = 0;
	    int somaidade = 0; 
	    for(int i = 1; i <= total; i++){
		System.out.print("Por favor, digite a idade da "+ i +"º pessoa: ");
		int idade = ler.nextInt();
		System.out.print("Por favor, agora informe o sexo (F - feminino, M - masculino) da "+ i + "º pessoa:");
		char sexo = ler.next().charAt(0);
		if(sexo == 'F'){
		somaidadeF += idade;
		contagemF++;
		}
		if(sexo == 'M'){
		somaidadeM += idade;
		contagemM++;
		}
		somaidade += idade;
	    }

	    double media = somaidade / total;
	    double mediaF =  somaidadeF / contagemF;
	    double mediaM = somaidadeM / contagemM;
	    
	    System.out.print(" A media das idades total é de: " + media);
	    System.out.print(" A media feminina é de: "+ mediaF);
		System.out.print(" A media masculina é de: "+ mediaM);
	}
}