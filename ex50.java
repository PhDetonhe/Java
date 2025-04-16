/******************************************************************************
50 Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
 a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
 b) Mostrar os valores finais com e sem imposto.es.
 *******************************************************************************/
import java.util.Scanner;

public class ex50
{
	public static void main(String[] args) {
		double[] compra = new double[10];
        double valortotal = 0.0;
        double imposto = 0.0;
        double valortotalT = 0.0;
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < compra.length; i++) {
		    System.out.print("Informe o valor do " + (i+1) + "° produto: ");
		    compra[i] = ler.nextDouble();
		    valortotal += compra[i];
		}
		if (valortotal > 1200){
		    valortotalT = valortotal * 0.025;
		    System.out.print("Valor de compra acima de 1200, taxa de 2,5% será colocada, o valor ficara em: "+ valortotalT);
		} else if (valortotal <= 1200){
		    System.out.print("O valor da compra é igual: "+ valortotal);
		}
	}
}
		
		
