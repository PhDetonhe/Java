/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Arraymaiordeidade
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    String[] nomes = new String[5];
	    int[] idades = new int[5];
	    
	    for(int i = 0; i < nomes.length; i++){
		System.out.println("Digite o nome da " + (i+1) +" º pessoa, por favor");
		nomes[i] = ler.nextLine();  
		
		System.out.println("Agora digite a idade da "+ (i+1) + "º pessoa, por favor");
	    idades[i] = ler.nextInt();
	    ler.nextLine();
	    
	    }
	    for(int i = 0; i < nomes.length; i++){
	        if(idades[i] >= 18){
	            System.out.println(nomes[i]+ "tem" + idades[i] +" anos de idade");
	        }
	    }
	     
		
	    
	}
	
}