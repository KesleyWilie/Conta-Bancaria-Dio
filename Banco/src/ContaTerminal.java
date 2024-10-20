import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do scanner para leitura de dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Solicitar o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Solicitar o nome do cliente
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo da conta
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
