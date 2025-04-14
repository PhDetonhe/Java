/******************************************************************************
2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100)
.O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".
*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Desafio1
{
public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   Random gerador = new Random();
   int Diff;
   int advFacil;
   int advM;
   int advD;
   int tentativas = 0;
   int erroF = 0;
   int numRF = gerador.nextInt(10) + 1;
   int numRM = gerador.nextInt(50) + 1;
   int numRD = gerador.nextInt(100) + 1;
   
System.out.println("Bem-vindo ao jogo da adivinhação! antes de tudo, por favor selecione a dificuldade: \n 1) fácil: 1 a 10, 2) médio: 1 a 50, 3) difícil: 1 a 100 \n selecione a dificuldade:");
Diff = ler.nextInt();
switch(Diff){
  case 1:
  do{
  System.out.println("dificuldade facil selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 10: ");
  advFacil = ler.nextInt();
  tentativas++;
  if(advFacil == numRF){
  System.out.println("Parabéns! você venceu.");
  break;
  } else {
      if(advFacil < numRF){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (tentativas <= 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ numRF);
break;

  case 2:
    do{
  System.out.println("dificuldade media selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 50: ");
  advM = ler.nextInt();
  tentativas++;
  if(advM == numRM){
  System.out.println("Parabéns! você venceu.");
  break;
  } else {
      if(advM < numRM){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (tentativas <= 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ numRM);  
break;
case 3:
    do{
  System.out.println("dificuldade dificil selecionada, o jogador tem 5 tentativas para acertar");
  System.out.println("por favor escolha um numero entre 1 a 100: ");
  advD = ler.nextInt();
  tentativas++;
  if(advD == numRD){
  System.out.println("Parabéns! você venceu.");
  break;
  } else {
      if(advD < numRD){
      System.out.println("Você errou...dica: o numero é maior!");
      } else
      System.out.println("Você errou...dica: o numero é menor!");
  }
} while (tentativas <= 5);
System.out.println("Numero de tentativas maximas atingida, o numero correto era: "+ numRD);  
break;
 

}
}
}
