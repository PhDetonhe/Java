import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha um numero entre 1 a 3");
        int n1 = ler.nextInt();

        switch(n1){
            case 1:
                System.out.println("Numero 1 seleionado");
                break;
            case 2:
                System.out.println("Numero 2 selecionado");
                break;
            case 3:
                System.out.println("Numero 3 selecioado");
                break;
            default:
                System.out.println("Por favor selecione um numero entre 1 a 3");
        }


    }
}
