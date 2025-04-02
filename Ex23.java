
/******************************************************************************

Ex23
Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. 
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.

*******************************************************************************/
import java.util.Scanner;
public class Ex23
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int total = 6;
	    int somapeso1 = 0;
	    int somapeso2 = 0;
	    int somapeso3 = 0;
	    int somapeso4 = 0;
	    int faixaEtaria1 = 0;
	    int faixaEtaria2 = 0;
	    int faixaEtaria3 = 0;
	    int faixaEtaria4 = 0;
	    for(int i = 1; i <= total; i++){
		System.out.println("Digite o peso da "+ i +" º pessoa:");
		double peso = ler.nextDouble();
		System.out.println("Digite a idade da "+ i +" º pessoa: ");
		double idade = ler.nextDouble();
		if(idade >= 1 && idade <= 10){
		somapeso1 += peso;
		faixaEtaria1++;
		}
		if(idade >= 11 && idade <=20){
		somapeso2 += peso;
		faixaEtaria2++;
		}
		if(idade >= 21 && idade <= 30){
		somapeso3 += peso;
		faixaEtaria3++;
		}else if(idade >= 31)
		somapeso4 += peso;
		faixaEtaria4++;
	    }
	    double media1 = somapeso1 / faixaEtaria1;
	    double media2 =  somapeso2 / faixaEtaria2;
	    double media3 = somapeso3 / faixaEtaria3;
	    double media4 = somapeso4 / faixaEtaria4;
	    
	    System.out.print(" A media de pesos da faixa etaria de 1 a 10 anos é: " + media1);
	    System.out.print(" A media de pesos da faixa etaria de 11 a 20 anos é: "+ media2);
		System.out.print(" A media de pesos da faixa etaria de 21 a 30 anos é: "+ media3);
		System.out.print(" A media de pesos da faixa etaria acima de 31 é: "+ media4);
		
	}
}
