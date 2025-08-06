import java.util.ArrayList;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        ArrayList<Double> cost = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String option;
        do{
            System.out.println("Por favor informe o nome do produto:");
            String names = read.nextLine().toLowerCase();
            name.add(names);

            System.out.println("Agora informe o preço do produto:");
            double preco = read.nextDouble();
            cost.add(preco);

            read.nextLine();

            System.out.println("Deseja continuar a compra");
            option = read.nextLine().toLowerCase();
        } while(option.equals("sim"));


        System.out.println("Produtos com o preço maior de 50R$:");
        for(int i = 0; i < cost.size(); i++){
            if(cost.get(i) > 50){
                System.out.println(name.get(i) + ", preço: " + cost.get(i));
            }

        }
    }
}
