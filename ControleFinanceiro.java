import java.util.Scanner;

public class ControleFinanceiro{
    public static void main(String args[]){
    
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int numeroConta;
        double saldoInicial;
        double limite;

        // Inicialização da Conta do Usuário
        System.out.println("=== CONFIGURAÇÃO INICIAL DA CONTA ===");
        System.out.print("Informe o nome do cliente: ");
        nome = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Informe o saldo inicial (R$): ");
        saldoInicial = scanner.nextDouble();

        System.out.print("Informe o limite de crédito (R$): ");
        limite = scanner.nextDouble();

    }
}