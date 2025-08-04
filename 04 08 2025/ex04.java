import java.util.Scanner;
public class ex04 {
    public static void main(String[] arg){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o intervalo do numeros");
        int n1 = ler.nextInt();

        System.out.println("os numeros são: ");

        for(int i =0; i <= n1;i++){
            if(i%2!=0){
                System.out.println("numero:"+i);
            }
        }

    }

}
