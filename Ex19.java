/******************************************************************************

Ex19
  Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

*******************************************************************************/
import java.util.Scanner;
public class Ex19
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int idademaisnova = 120;
	    String nomemaisnova = "";
	    for(int i = 1; i <= 10; i++){
	        
    		System.out.println("Por favor, informe o nome da "+ i +"º pessoa: ");
    		String nome = ler.nextLine();
    		
    		
    		System.out.println("Por favor, informe a idade de "+ nome +" : ");
    		int idade = ler.nextInt();
    		
    		if(idade < idademaisnova){
    		  idademaisnova = idade;
    		  nomemaisnova = nome;
		    }
		    
		    ler.nextLine();
	    }
		 System.out.print("O nome da pessoa mais nova é: "+ nomemaisnova +" e sua idade é: "+ idademaisnova);
	 
}
}
