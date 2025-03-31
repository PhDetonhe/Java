/******************************************************************************

Github
 Ex07

*******************************************************************************/
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double valorVend, comissao, salarioBruto;
        System.out.print("Qual o total vendido durante o mes de abril? ");
        valorVend = ler.nextDouble();
        comissao = valorVend * 0.10;
        if ( valorVend > 2000 ){
            salarioBruto = 1200 + comissao;
            System.out.println("A comissao recebida é de "+ comissao +". O salario bruto juntamente da comissao é igual a: "+ salarioBruto );
        }
        else {
            System.out.println("O numero de vendas foi insuficiente. A condicao para ganho de comissao foi reprovada.");
        }
     
    }
}
