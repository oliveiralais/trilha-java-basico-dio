import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int parametroUm = 12;
        int parametroDois = 30;

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = terminal.nextInt();

        // Bloco try-catch para tratar possíveis exceções ao chamar o método contar
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Captura e trata a exceção ParametrosInvalidosException
            // Imprime a mensagem de erro da exceção
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    // Método estático contar que realiza a contagem e lança uma exceção se os parâmetros forem inválidos
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        // Valida e lança uma exceção se o primeiro parâmetro for maior que o segundo
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for(int i = 1; i <= (parametroDois - parametroUm); i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
