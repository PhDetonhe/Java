/******************************************************************************
54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.
*******************************************************************************/
import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
    int[] numeros = new int[8];
    Scanner ler = new Scanner(System.in);
    int impar = 0;
    int par = 0;
    int imparM = 1;
    int PImar=0;

for (int i = 0; i < numeros.length; i++) { 
    System.out.println("Por favor, Insira um número:");
    numeros[i] = ler.nextInt();
if (numeros[i] % 2 != 0) { 
     impar++; 
    imparM *= numeros[i];
} else {
    par++; 
    }
  }
  System.out.println("\nQuantidade de números pares: " + par + "\nMultiplicção dos números impares:" + imparM);
    }
}