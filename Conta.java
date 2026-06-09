import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "Juliana Peixoto";
        String tipoConta = "Corrente";
        double saldo = 4801.50;

        System.out.println("*******************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************");

        int opcao = 0;
        String menu = """
                **Digite sua opção**
                1 - Consultar saldo
                2 - Realizar transferência
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) { 
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                    break;


                case 2:
                    System.out.println("Qual valor você deseja transferir?");
                    double transferencia = leitura.nextDouble();
                    if (transferencia <= saldo) {
                        saldo -= transferencia;
                     System.out.println("Transfência realizada com sucesso!"); 
                    } else {
                        System.out.println("Não há saldo suficiente para essa transferência.");
                    }
                    break;

                case 3:
                    System.out.println("Qual valor você irá receber?");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Valor recebido com sucesso! Seu saldo atual é: R$ %.2f%n", saldo);
                    break;
                
                case 4:
                    System.out.println("Programa encerrado. Até logo!");
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        }
        leitura.close();
    }
}