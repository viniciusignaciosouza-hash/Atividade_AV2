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

        int opcao; 

        opcao = scanner.nextInt();
        scanner.nextLine();

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA DE CONTROLE FINANCEIRO ===");
            System.out.println("1 - Adicionar Receita / Depósito");
            System.out.println("2 - Cadastrar e Pagar Despesa");
            System.out.println("3 - Definir / Atualizar Meta");
            System.out.println("4 - Poupar para a Meta");
            System.out.println("5 - Exibir Relatório Financeiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
        
            switch (opcao) {
                case 1:
                    
                case 2:
                   
                    break;
                case 3:
                    
                    break;
                case 4:
                  
                    break;
                case 5:
                 
                    break;
                case 6:
                    System.out.println("\nEncerrando o sistema...");
                   
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);
        

    }
}