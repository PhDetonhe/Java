/******************************************************************************

3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.


*******************************************************************************/
import java.util.Scanner;
public class desafio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1;
        double somaNotas = 0;
        int totalnotas = 0;
        double mediaN;

        System.out.print("Bem-vindo ao sistema Cadastro de notas:\n instruções: a nota inserida vai ser classificada e mostrada.\n se quiser encerrar insira -1, ao encerrar o programa, a media de todas as notas colocadas sera mostrado. \n");

        do {
            System.out.print(" Informe uma nota e após isso digite -1 para encerrar o programa.\n Nota: ");
            Nota = ler.nextInt();
           
            if ( Nota == -1){
                break;
            }

            totalnotas++;

            if (Nota >= 9) {
                System.out.print("A nota é excelente. ");
            } else if (Nota >= 7 && N1 < 9) {
                System.out.print("A nota é Boa.");
            } else if (Nota >= 5 && N1 < 7 ) {
                System.out.print("A nota é Regular. ");
            } else if (Nota < 5 && N1 >= 0) {
                System.out.print("A nota é Insuficiente. ");
            }
           
            somaNotas += Nota;

        } while (Nota != -1);
        

        mediaN = (int) somaNotas / totalnotas;
        

        System.out.print("\nSistema encerrado. A media das notas é de: " + mediaN);
    }
}