/******************************************************************************
41 - O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.
*******************************************************************************/
import java.util.Scanner;
public class ex41
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    System.out.println("Bom dia ou Boa noite! Por favor informe o peso do seu prato (em kg) :");
	    double Peso = ler.nextDouble();
	    double Valorpeso = Peso * 12.00;
	    System.out.println("O valor a pagar pelo prato é de: "+ Valorpeso);
}
}
