/******************************************************************************
43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*******************************************************************************/
import java.util.Scanner;
public class ex43
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    System.out.println("Por favor, Informe seu salario :");
	    double Salario = ler.nextDouble();
	    double aumento = Salario * 0.15;
	    double imposto = Salario * 0.08;
	    double SalarioA = Salario + aumento;
	    double SalarioF = SalarioA - imposto;
	    System.out.println("O salarial inicial era de: "+ Salario +"\n o aumento foi de: "+ aumento +"\n o imposto, após o aumento é de: "+ imposto + "\n O salario com aumento é de: "+ SalarioA + "\n O salario final é de: "+ SalarioF);
}
}
