/******************************************************************************
30. Escreva um programa que pergunta um número ao usuário, e
        mostre sua tabuada completa desse número (de 1 até 10).
 *******************************************************************************/
import java.util.Scanner;
public class ex30
{
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);
     int n, tabuada, i = 1;
     System.out.print("Insira um número entre 1 a 10 para visualizar a tabuada:");
     n = ler.nextInt();
     if (n < 1 || n > 10 ){
        System.out.println("Este numero não é possivel, por favor, Insira números Somente de 1 a 10.");
     } else {
        System.out.println("Tabuada do número "+ n + ":");
        while (i <= 9){
            i++;
            tabuada = n * i;
            System.out.println(n + "x" + i + " = " + tabuada);
        }
     }
    }
}




