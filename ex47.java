/******************************************************************************
47. Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.
*******************************************************************************/

import java.util.Scanner;
public class ex47 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.println("por favor, insira um número qualquer:");
            numeros[i] = ler.nextInt();
        }
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}