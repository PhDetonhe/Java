/******************************************************************************
48. Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*******************************************************************************/
import java.util.Scanner;
public class ex48 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
int[] numeros = new int[5];
int somanumeros = 0;
for (int i = 0; i < numeros.length; i++) {
System.out.println("Insira um número inteiro qualquer:");
numeros[i] = ler.nextInt();
}
for (int i = 0; i < numeros.length; i+=2) {
somanumeros += numeros[i];
}
System.out.println("A soma de todos os valores em posições ímpares é igual a " + somanumeros + ".");
    }
}