import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);



        String[]nomes = new String [5];
        double[]saldos = new double [5];
        String[]senhas = new String[5];
        int clients = 0;
        double valorDp;
        boolean SB = true;

        while(true)
            System.out.println("Sistema Bancário:");
        System.out.println("Bom dia! Por favor informe se sua conta já esta cadastrada ou se deseja cadastrar uma conta nova: 1. Criar nova conta 2.Depositar 3. Sacar 4. Consultar saldo 5. Sair ");
        int escolha = Ler.nextInt();

        switch(escolha) {
            case 1:
                if(escolha == 1){
                    for(int i = 0; i < clients; i++){
                        System.out.println("Por favor entre com o nome da conta bancaria:");
                        nomes[i] = Ler.nextLine();
                        Ler.nextLine();
                        System.out.println("Por favor entre com a senha da conta bancaria:");
                        senhas[i] = Ler.nextLine();
                        saldos[clients] = 0.0;
                        clients++;
                        System.out.println("Conta criada.");
                    }
                } else {
                    System.out.println("Limite de contas atingido.");
                }
                break;

            break;
            case 2:
                System.out.println("Nome do cliente: ");
                String nomeD = Ler.nextLine();
                System.out.println("Senha do cliente: ");
                String senhaD = Ler.nextLine();
                for(int i = 0; i < nomes.length; i++){
                    if(nomes[i].equals(nomeD) && senhas[i].equals(senhaD)){
                        System.out.println("Digite o valor a ser depositado: ");
                        valorDp = Ler.nextDouble();
                        saldos[i] += valorDp;
                        System.out.println("Deposito realizado.");

                    }
                }
                break;
            case 3:
                System.out.println("Nome do cliente: ");
                String nomeS = Ler.nextLine();
                System.out.println("Senha do cliente: ");
                String senhaS = Ler.nextLine();
                for(int i = 0; i < nomes.length; i++){
                    if(nomes[i].equals(nomeS) && senhas[i].equals(senhas)){
                        System.out.println("Digite o valor a ser sacado: ");
                        double valorSq = Ler.nextDouble();
                        if(valorSq >= valorDp){
                            saldos[i] -= valorSq;
                            System.out.println("Saque realizado.");
                        } else
                            System.out.println("Saldo invalido para um saque.");

                    }
                }

            case 4:
                System.out.println("Nome do cliente: ");
                String nomesaldo = Ler.nextLine();
                for (int i = 0 ; i < nomes.length; i++){
                    if(nomes[i].equals(nomesaldo)){
                        System.out.println("O saldo de"  + nomes[i] + "é de: "+ saldos);
                    }
                }
            case 5:
                System.out.println("Saindo...");
                return;

            default:
                System.out.println("Opção inválida.");





        }





    }
}