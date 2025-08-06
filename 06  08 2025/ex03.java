//3.Escreva um programa que preencha um ArrayList com os 20 primeiros números pares. Em seguida, remova todos os elementos divisíveis por 4.
import java.util.Scanner;
import java.util.ArrayList;
public class ex03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int n1;


        while(lista.size() < 20){
            System.out.println("Insira o " + lista.size() + " º numero par: ");
            n1 = ler.nextInt();
            if(n1 % 2 == 0){
                lista.add(n1);
            } else {
                System.out.println("O numero não é par insira outro numero: ");
            }
        }



        lista.removeIf(numero -> numero % 4 == 0 );



        for(int list : lista){
            System.out.println("lista dos numeros pares, com os numeros divisiveis por 4 removidos: " + list);
        }

    }

}