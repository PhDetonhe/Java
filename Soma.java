/******************************************************************************

github projeto 2

*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
	    Double a, b, soma;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Informe o primeiro numero");
		a = ler.nextDouble();
		System.out.println("Informe o segundo numero");
		b = ler.nextDouble();
		soma = a + b;
		System.out.println("O resultado é de: " + soma);
	}
}
