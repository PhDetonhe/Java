/******************************************************************************

Ex21
Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 
*******************************************************************************/
import java.util.Scanner; 
public class Ex21
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int total = 4;
	    int pesoIdade = 0;
	    int idadepessoaBaixa = 0;
	    int pessoabaixa = 0;
	    int quanAzul = 0;
	    int ruivosnaoAzuis = 0;
        for(int i=1; i<=total; i++){
		System.out.println("Por favor, digite a idade da "+ i +"º pessoa: ");
		int idade = ler.nextInt();
	    System.out.print("Digite o peso da "+ i +"º pessoa: ");
	    double peso = ler.nextDouble();
		System.out.print("Digite a altura da "+ i +"º pessoa: ");
		double altura = ler.nextDouble();
		ler.nextLine();
		System.out.print("Digite a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho): ");
		char corOlhos = ler.next().charAt(0);
		System.out.print("Digite a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo): ");
		char corCabelo = ler.next().charAt(0);
		if(idade > 50 && peso < 60 ){
         pesoIdade++;
		}
		if(altura < 1.50){
		idadepessoaBaixa += idade;
		pessoabaixa++;
		}
		if(corOlhos == 'A'){
		    quanAzul++;
		}
		if(corOlhos != 'A' && corCabelo == 'R'){
		ruivosnaoAzuis++;
		}
        }
        
        double porolhosazuis = (quanAzul / (double) total) * 100;
        double mediabaixaidade = (double) idadepessoaBaixa / pessoabaixa;
        
        System.out.println("\nResultados:");
        System.out.print("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + pesoIdade);
        System.out.print("Média das idades das pessoas com altura inferior a 1,50m: "+ mediabaixaidade);
        System.out.print("Porcentagem de pessoas com olhos azuis: "+ porolhosazuis);
        System.out.print("Quantidade de pessoas ruivas que não possuem olhos azuis: " + ruivosnaoAzuis);
        
        

	}
}

