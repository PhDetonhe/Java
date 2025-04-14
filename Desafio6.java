/******************************************************************************
6 - Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais

*******************************************************************************/

import java.util.Scanner;
import java.lang.Math;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double x2;

        // Entrada do A, B e C
        System.out.print("Informe o valor A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor C: ");
        double c = scanner.nextDouble();
        // delta(b² - 4.a.c)
        double delta = Math.pow(b, 2) - 4 * a * c;
        // vendo se tem raizes reais
        if (delta < 0) {
            System.out.println("A equação não possui raízes.");
            // acaso delta 0, a equação so tem 1 raiz real
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            System.out.println("Delta: " + delta);
            System.out.println("A equação possui apenas uma raiz.");
            System.out.println("x:" + x0);
        } else {
        // Calculando x1/x2
             x1 = (-b + Math.sqrt(delta)) / (2 * a);
             x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta = " + delta);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}