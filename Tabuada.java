/******************************************************************************

Repetiçãoex
Github

*******************************************************************************/
import java.util.Scanner;
public class Tabuada
{
	public static void main(String[] args) {
	int n, resultado;
	    Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a tabuada do que deseja: ");
		n = ler.nextInt();
		
		for(int i=1; i <= 10; i++ ) {
			resultado = n * i; 
		System.out.println(n + " . " + i + " = " + resultado);
		}
	}
}
