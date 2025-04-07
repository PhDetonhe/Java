/******************************************************************************
 ex.26
 Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

 *******************************************************************************/
import java.util.Scanner;
public class ex26 
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0, ateN = 0;
        System.out.println("Insira um número inteiro qualquer:");
        n = ler.nextInt();
        while(ateN <= (n - 1)){
            ateN++;
            System.out.println(numeros);
        }
    }
}