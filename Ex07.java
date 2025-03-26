/******************************************************************************

Github
 Ex07

*******************************************************************************/
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double n1, n2, n3;
        System.out.print("Qual o total vendido durante o mes de abril? ");
        valorVend = ler.nextDouble();
        n2 = 10/valorVend * 100;
        if ( valorVend > 2000 ){
            n3 = 1200 + n2;
            System.out.println("A comissao recebida é de "+ n2 +". O salario bruto juntamente da comissao é igual a: "+ n3 );
        }
        else {
            System.out.println("O numero de vendas foi insuficiente. A condicao para ganho de comissao foi reprovada.");
        }
     
    }
}