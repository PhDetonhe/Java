/******************************************************************************

Github
 Ex06

*******************************************************************************/
import java.util.Scanner;
public class Ex06{
public static void main (String[] args) {
    int a, par, impar, resto;
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite um numero");
    a = ler.nextInt();
    resto = a % 2;
    if (resto == 0){
        System.out.println("O numero é par");
    } else
        System.out.println("O numero é impar");
    
    
}
}