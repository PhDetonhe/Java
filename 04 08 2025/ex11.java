import java.util.Scanner;
import java.util.ArrayList;
public class ex11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 1; i < 11; i++){
            System.out.println("Insira o " + i + " numero: ");
            int n1 = ler.nextInt();
            lista.add(n1);
        }

        for(int list : lista){
            System.out.println("Antes da remoção:" + list);
        }
        lista.remove(4);
        for(int list : lista){
            System.out.println("Depois da remoção"+ list);
        }





    }

}

