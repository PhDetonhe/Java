/******************************************************************************

37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
 
*******************************************************************************/
import java.util.Scanner;
public class ex37
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    System.out.println("Por favor, informe quantos cavalos foram comprados: ");
	    int cavalos = ler.nextInt();
	    int qntdFerraduras = cavalos * 4;
	    System.out.println("É necessario comprar " + qntdFerraduras + " ferraduras .");
	    
}
}

