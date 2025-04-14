/******************************************************************************
1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0.
O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.

*******************************************************************************/

import java.util.Scanner;
public class desafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tonhao = 0;
        int carlos = 0;
        int tapioca = 0;
        int v;
        int voto = 0;
        System.out.print("Bem-vindo ao sistema de votação!");
        do {
            System.out.print("Vote em um candidato (digite -1 para encerrar.) \n 1)Tonhão do Gás\n 2)Carlos salgados\n 3)Capitão Tapioca \n voto:");
            v = ler.nextInt();
            if (v == 1) {
                tonhao++;
            } else if (v == 2) {
                carlos++;
            } else if (v == 3) {
                tapioca++;
            } else if (v != 0) {
                System.out.print("Voto invalido, por favor digite o numero do candidato da sua preferencia.");
            }

        } while (v != 0);

        System.out.print("Resultado da simulação: \n 1) Tonhão do Gás = " + tonhao + " votos \n 2) Carlos salgados = " + carlos + " votos \n 3) Capitão Tapioca = " + tapioca + " votos \n");

        if (tonhao > carlos && tonhao > tapioca) {
            System.out.print("O vencedor é: Tonhão do Gás");
        } else if (carlos > tonhao && carlos > tapioca) {
            System.out.print("O  vencedor é: Carlos salgados");
        } else if (tapioca > tonhao && tapioca > carlos) {
            System.out.print("O  vencedor é: Capitão Tapioca");
    }
    }
}