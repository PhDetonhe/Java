/******************************************************************************

2) Faça um programa que leia uma matriz 3x4 de inteiros
, substitua seus elementos negativos por 0 e imprima a matriz original e a modificada.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int [][] matrizOG = new int[3][4];
int [][] matriz = new int [3][4];

for(int i = 0; i < matrizOG.length; i++){
   for(int j = 0; j < matrizOG[i].length; j++){
   System.out.println(" linha: "+ i + " coluna: "+ j);
   matrizOG[i][j] = ler.nextInt();
   
}
}



for(int i = 0; i < matrizOG.length; i++){
for(int j = 0; j < matrizOG[i].length; j++){
 matriz[i][j] = matrizOG[i][j];
}
}


for(int i = 0; i < matriz.length; i++){
for(int j = 0; j < matriz[i].length; j++){
if(matriz[i][j] < 0){
   matriz[i][j] = 0;
}
}
}

}
}