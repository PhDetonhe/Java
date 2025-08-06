import java.util.Scanner;
import java.util.ArrayList;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double somadasnotas = 0;
        double media = 6;
        double mediadoAluno = 0;

        while (notas.size() < 3) {
            for (int i = 1; i < 4; i++) {
                System.out.println("Digite a " + i + "º nota do aluno:");
                double grade = ler.nextDouble();
                notas.add(grade);
            }

            for (int i = 0; i < notas.size(); i++) {
                somadasnotas += notas.get(i);
            }

            mediadoAluno = somadasnotas / notas.size();
        }


        System.out.println(mediadoAluno);
        if (mediadoAluno < media) {
            System.out.println("Abaixo da média");
        } else {
            System.out.println("Acima da média");
        }

    }
}