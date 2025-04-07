/******************************************************************************
 ex.29
 Escreva um programa que pergunte ao usuário quantos alunos ele
 tem em sua academia. Em seguida, através de um laço while, o usuário
 digita o peso de todos os alunos, um por vez, e por fim, o programa deve
 mostrar a média de peso dos clientes.

 *******************************************************************************/
import java.util.Scanner;

public class ex29 {
 public static void main (String[] args) {
     Scanner ler = new Scanner(System.in);

     int numstudent, pesostudent, mediapeso = 0, pesototal = 0;


     System.out.println("Qual o numero de alunos na academia?");
     alunos = ler.nextInt();

     int numpessoas = 1;


     while ( numpessoas <= alunos) {
     System.out.println("Qual o peso do " + numpessoas +"° aluno(a)?");
     pesoalunos = ler.nextInt();

    pesototal += pesoalunos;
    numpessoas++;
     }

     mediapeso = pesototal / alunos;
     System.out.println("A média do peso é de: " + mediapeso);

}
}



