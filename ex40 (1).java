/******************************************************************************

40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.

*******************************************************************************/
import java.util.Scanner;
public class ex40
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double totalvalor;
	    double preçogas;
	    double valorN;
	    System.out.println("Qual o preço da gasolina (litro): ");
	    double preço = ler.nextDouble();
	    System.out.println("Qual o valor desejado para abastecer: ");
	    valorN = ler.nextDouble();
	    totalvalor = valorN / preço;
	    System.out.println("VocÊ abasteceu "+ totalvalor + " litros de gasolina");
}
}

