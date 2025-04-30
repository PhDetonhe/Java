/******************************************************************************

6.   
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 
utilizando um laço de repetição. Utilize for.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for(int num = 1; num < 100; num++) {
            if (num % 2 == 0) {
                soma += num;
            }
        }

        System.out.println("Soma dos números pares de 1 a 100: " + soma);
    }
}