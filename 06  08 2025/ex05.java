import java.util.ArrayList;
import java.util.Scanner;
public class ex05{
    public static void main(String[]args){
        ArrayList<String> Words = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String word;
        String option;
        int wordswithA = 0;
        int cwords = 0;


        do{
            System.out.println("Digite a palavra por favor: ");
            word = read.nextLine().toLowerCase();
            Words.add(word);

            System.out.println("Deseja continuar a compra");
            option = read.nextLine().toLowerCase();
        } while(option.equals("sim"));


        for(int i = 0; i < Words.size(); i++){
            if(Words.get(i).startsWith("a")){
                wordswithA++;
            } else {
//                cwords++;
            }

        }
        System.out.println(wordswithA);
        System.out.println(cwords);






    }
}
