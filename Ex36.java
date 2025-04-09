/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Ex36
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double tentativas = 0;
	    String usercerto = "Felipe123";
	    String senhacerta = "felipeñétalaric0";
	    double saldo = 7500;
	    String senha;
	    String user;
	    do{
		System.out.println("Por favor! insira a senha e o usuario do banco!");
		System.out.println("Usuario: ");
		 user = ler.nextLine();
		System.out.println("Senha: ");
		senha = ler.nextLine();
		if(user.equals(usercerto) && senha.equals(senhacerta)){
		    System.out.println("Selecione a opção desejada: \n a) Depósito bancário \n b) Saque \n c) Saldo \n d) Sair");
		    String opção = ler.nextLine().toLowerCase();
		    if(opção.equals("a")){
		        System.out.print("Depósito bancário selecionado, quanto deseja depositar? \n deposito: ");
		        double deposito = ler.nextDouble();
		        double DepositoT = saldo + deposito;
		        System.out.println("Seu saldo agora é de: "+ DepositoT);
		        break;
		    }else if(opção.equals("b")){
		        System.out.print("Saque selecionado, quanto deseja sacar? \n saque: ");
		        double saque = ler.nextDouble();
		        double SaqueT = saldo-saque;
		        System.out.println("Seu saldo agora é de: "+ SaqueT);
		        break;
		    }else if(opção.equals("c")){
		        System.out.print("saldo selecionado, seu saldo atualmente agora é de: "+ saldo);
		        break;
		    }else if(opção.equals("d")){
		        System.out.println("tem certeza que deseja sair? 1) sim 2) Não");
		        int sair = ler.nextInt();
		         if(sair == 1){
		          System.out.println("Saindo da conta, aguarde...");
		          System.out.println("Saida da conta realizada");
		         }else if (sair == 2 ){
		             System.out.println("Voltando ao menu de opções.");
		         }else
		         System.out.println("Opção invalida.");
		        break;
		    }
	    } else
	    System.out.println("Senha ou Usuario incorreto tente novamente.");
	    tentativas++;
	}while(tentativas < 3);
	System.out.println("Numero de tentativas alcançada, tente novamente mais tarde.");
}
}
