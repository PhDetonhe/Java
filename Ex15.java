/******************************************************************************

Ex15
Escreva um programa que calcule a soma dos números de 1 a 15.

*******************************************************************************/
public class Ex15 {

    public static void main(String[] args) {
        soma = 0;
         for (int i = 1; i <= 15; i++) {
            int soma += i; 
           System.out.println("o resultado do calculo da soma é de : " + soma);
       }
    }
}