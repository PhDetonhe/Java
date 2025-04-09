/******************************************************************************

45 - A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 

*******************************************************************************/

import java.util.Scanner;
public class ex45
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		System.out.println("Por favor, Informe a quantidade de sanduiches a serem feitos: ");
		int Sanduiche = ler.nextInt();
		double misto = 50 * Sanduiche;
		double hambúrguer = 100 * Sanduiche;
		double kgmisto = misto / 1000;
		double kghambúruer = hambúrguer / 1000;
		
		System.out.println("numero de sanduiches: "+ Sanduiche + " quantidade em kg de queijo e presunto: "+ kgmisto +" quantidade em kg de carne: "+ kghambúruer);
		
	}
}