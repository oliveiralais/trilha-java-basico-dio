import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean execucao = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (execucao) {

            // MENU
            // Depositar        (1): O programa solicitará o valor a ser depositado e atualizará o saldo.
            // Sacar            (2): O programa solicitará o valor a ser sacado e verificará se há saldo suficiente.
            // Consultar Saldo  (3): O programa exibirá o saldo atual da conta.
            // Encerrar         (0): O programa encerrará.

            int opcao = scanner.nextInt();

            // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
            // Dica: Utilize o switch/case para o programa realizar as operações escolhidas pelo usuário.

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if(saque > saldo){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    execucao = false;
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    // código a ser executado se variavel não corresponder a nenhum dos casos acima
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}