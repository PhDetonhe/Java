/******************************************************************************

Github
 Ex05

*******************************************************************************/
import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double n1, n2, n3, salario30porcento, valorparcela;
        System.out.print("Qual sera o valor do emprestimo? : ");
        n1 = ler.nextDouble();
        System.out.print("Em quantas parcelas sera pago? : ");
        n2 = ler.nextDouble();
        System.out.print("Qual o salario do solicitante? : ");
        n3 = ler.nextDouble();
        salario30porcento = n3 * 0.30;
        valorparcela = n1/n2;
        if ( valorparcela <= salario30porcento ){
            System.out.println("O emprestimo foi aprovado!");
        }
        else {
            System.out.println("O emprestimo foi reprovado!");
        }
     
    }
}
