import java.util.ArrayList;
import java.util.Arrays;

public class ex08 {
    public static void main(String[] args){
        String[] disciplinas= {"Matematica","Filosofia", "Historia", "Fisica"};
        ArrayList<String> novalista = new ArrayList<String>(Arrays.asList(disciplinas));
        novalista.add("Lingua inglesa");
        novalista.add("Geografia");

        for(String i: novalista){
          System.out.println("disciplinas: "+ i);
        }

    }

}
