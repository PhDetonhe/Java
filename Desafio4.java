/******************************************************************************

4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, 
e o programa informa quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. 
Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.

*******************************************************************************/
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ced100 = 0;
        int ced50 = 0;
        int ced20 = 0;
        int ced10 = 0;
        int ced5 = 0;

        System.out.println("=== Caixa Eletrônico ===");
        System.out.print("Informe o valor do saque: R$ ");
        int valor = ler.nextInt();
        

        // Verifica se o valor é possível com as cédulas disponíveis
        if (valor % 5 != 0 || valor <= 0) {
            System.out.println("Não é possível sacar esse valor com as cédulas disponíveis.");
        } else {
            while(valor > 100){
            ced100++;
            break;
            }
            while(valor > 50){
            ced50++;
            break;
            }
            while(valor > 20){
            ced20++;
            break;
            }
            while(valor > 10){
            ced10++;
            break;
            }
            while(valor > 5){
            ced5++;
            break;
            }
            System.out.println("Cédulas entregues:");
            if (ced100 > 0) System.out.println("R$100: " + ced100);
            if (ced50 > 0) System.out.println("R$50: " + ced50);
            if (ced20 > 0) System.out.println("R$20: " + ced20);
            if (ced10 > 0) System.out.println("R$10: " + ced10);
            if (ced5 > 0) System.out.println("R$5: " + ced5);
        }
    }
}
