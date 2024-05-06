import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        // declaracao de variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite o número da conta: ");
        numero = terminal.nextInt();

        System.out.print("Digite o número da agência: ");
        agencia = terminal.next();
        terminal.nextLine(); // Consumindo a quebra de linha não consumida

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = terminal.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = terminal.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
