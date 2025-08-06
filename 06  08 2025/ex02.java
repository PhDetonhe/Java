import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ex02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            System.out.println("Insira o " + i + " º nome: ");
            String n1 = ler.nextLine();
            lista.add(n1);
        }

        Collections.reverse(lista);


        for(String list : lista){
            System.out.println("nomes: " + list);
        }







    }

}