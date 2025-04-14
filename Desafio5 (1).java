/******************************************************************************
5 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. 
Calcule o valor final com juros compostos de 2% ao mês. 
Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.

*******************************************************************************/

import java.util.Scanner;
public class Desafio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opcao;

        System.out.println("Bem-vindo ao simulador de empréstimo com juros compostos");

do {
            
            System.out.print("Digite o valor desejado para o empréstimo (R$): ");
            double valorD = ler.nextDouble();
            System.out.print("Informe o número de parcelas: ");
            int Parcelas = ler.nextInt();
            if (Parcelas > 0) {
                final double taxaJuros = 0.02; 
                double valorTotal = valorD * Math.pow(taxaJuros, Parcelas);
                double valorParcela = valorTotal / Parcelas;
                System.out.printf("O valor total a pagar é de R$ "+ valorTotal);
                System.out.printf("Cada parcela será de R$ "+ valorParcela +" E o numero de parcelas é de: "+ Parcelas);
            } else {
                System.out.println("Por favor, coloque o numero de parcelas novamente.");
}

            System.out.print("Deseja continuar na simulação? (s/n): ");
            opcao = ler.nextLine();

} while (opcao.equals("s"));

        System.out.println("Obrigado por utilizar o simulador. Até a próxima!");
       
    }
} 