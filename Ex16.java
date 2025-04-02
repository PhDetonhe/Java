/******************************************************************************

Ex16
 Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

*******************************************************************************/
import java.util.Scanner;
public class Ex16                    
{
	public static void main(String[] args) {
	    String NE;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		NE = ler.nextLine();
		for(int i=1; i <= 10; i++ ){
		    System.out.println(NE);
		}
		
		
	}
}
