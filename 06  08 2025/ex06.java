import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class ex06 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int numeroAleatorio = random.nextInt(100);
            numeros.add(numeroAleatorio);
        }

        Collections.sort(numeros);

        for(int numero: numeros){
            System.out.println(numero);
        }

    }
}